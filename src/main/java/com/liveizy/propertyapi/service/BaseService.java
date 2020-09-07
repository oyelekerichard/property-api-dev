package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.config.Config;
import com.liveizy.propertyapi.models.GenericDocument;
import com.liveizy.propertyapi.util.HttpUtil;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.liveizy.propertyapi.dto.input.LoginObj;
import com.liveizy.propertyapi.models.Apartment;
import com.liveizy.propertyapi.repository.PropertyRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(BaseService.class);
    
    @Autowired
    private PropertyRepository propRepo;

    protected <T extends GenericDocument, S extends CrudRepository> T create(S s, T t) {
        t.setUuid(getUniqueUuid(t));
//        t.setCreatedBy("createdBy");
        t.setCreatedDate(LocalDateTime.now());
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
//        t.setTenantId("tid");
        t.setTenantId(generateTenantId(t));
        t.setActive(true);
        return (T) s.save(t);
    }
    
    protected <T extends Apartment, S extends CrudRepository> T createApartment(S s, T t) {
        t.setApartmentId(t.getPropertyId()+"100");
        
        return (T) s.save(t);
    }


    protected <T extends GenericDocument, S extends CrudRepository> T update(S s, T t) {
        t.setLastModifiedBy("");
        t.setLastModifiedDate(LocalDateTime.now());
        return (T) s.save(t);
    }

    private <T extends GenericDocument> String getUniqueUuid(T t) {
        return RandomStringUtils.randomAlphanumeric(7);
    }

    private <T extends GenericDocument> String generateTenantId(T t) {
        return ("TEN").concat(RandomStringUtils.randomAlphanumeric(27));
//        return UUID.randomUUID().toString();

    }

    private <T extends GenericDocument> String getCreatedBy(T t) {
        return ("TEN").concat(RandomStringUtils.randomAlphanumeric(27));
//        return UUID.randomUUID().toString();

    }
    
    protected <T extends GenericDocument, S extends CrudRepository> T createUser(S s, T t) 
    {
        return (T) s.save(t);
    }

    public static String getToken(LoginObj loginObj, HttpServletResponse response) throws Exception {
        logger.info("HERE OR THERE 1");
        Config con = Config.getInstance();
        logger.info("HERE OR THERE 2");
        loginObj.setUsername(loginObj.getEmail());
        logger.info("HERE OR THERE 3");
        String tokenResult = HttpUtil.sendPost(con.getTokenUrl(), new Gson().toJson(loginObj));
        logger.info("HERE OR THERE 4");
        logger.info(tokenResult);
        logger.info("HERE OR THERE 5");
        return tokenResult;
    }
}
