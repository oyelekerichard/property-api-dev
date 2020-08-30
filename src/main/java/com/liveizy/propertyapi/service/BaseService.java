package com.liveizy.propertyapi.service;


import com.liveizy.propertyapi.models.GenericDocument;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;

public class BaseService {

    protected <T extends GenericDocument, S extends CrudRepository> T create(S s, T t){
        t.setUuid(getUniqueUuid(t));
//        t.setCreatedBy("createdBy");
        t.setCreatedDate(LocalDateTime.now());
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
//        t.setTenantId("tid");
        t.setTenantId(getTenantId(t));
        t.setActive(true);
        return (T) s.save(t);
    }

    protected <T extends GenericDocument, S extends CrudRepository> T update(S s, T t){
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
        return (T) s.save(t);
    }

    private <T extends GenericDocument> String getUniqueUuid(T t) {
        return RandomStringUtils.randomAlphanumeric(8).concat("PR");
//        return UUID.randomUUID().toString();
        
    }

    private <T extends GenericDocument> String getTenantId(T t) {
        return ("TEN").concat(RandomStringUtils.randomAlphanumeric(27));
//        return UUID.randomUUID().toString();
        
    }

    private <T extends GenericDocument> String getCreatedBy(T t) {
        return ("TEN").concat(RandomStringUtils.randomAlphanumeric(27));
//        return UUID.randomUUID().toString();
        
    }


}
