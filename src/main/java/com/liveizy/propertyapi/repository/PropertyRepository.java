package com.liveizy.propertyapi.repository;

import com.liveizy.propertyapi.models.Properties;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface PropertyRepository extends PagingAndSortingRepository<Properties, String> {


}
