package com.liveizy.propertyapi.service;


import com.liveizy.propertyapi.models.GenericDocument;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseService {

    protected <T extends GenericDocument, S extends CrudRepository> T create(S s, T t){
        t.setUuid(getUniqueUuid(t));
        t.setCreatedBy("createdBy");
        t.setCreatedDate(LocalDateTime.now());
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
        t.setTenantId("tid");
        t.setActive(true);
        return (T) s.save(t);
    }

    protected <T extends GenericDocument, S extends CrudRepository> T update(S s, T t){
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
        return (T) s.save(t);
    }

    private <T extends GenericDocument> String getUniqueUuid(T t) {
        return UUID.randomUUID().toString();
    }


}
