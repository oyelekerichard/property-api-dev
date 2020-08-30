package com.liveizy.propertyapi.repository;

import com.liveizy.propertyapi.models.Properties;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends PagingAndSortingRepository<Properties, String> {

    Properties findByUuid(String propertyId);
    List<Properties> findByCreatedBy(String createdBy);
    
//    List<Properties> findAllPropertiesByCreatedBy(String createdBy, Pageable pageable);
}
