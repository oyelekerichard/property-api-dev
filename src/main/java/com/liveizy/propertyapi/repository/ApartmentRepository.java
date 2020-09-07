/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.repository;

import com.liveizy.propertyapi.models.Apartment;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author richard.oyeleke
 */
@Repository
public interface ApartmentRepository extends PagingAndSortingRepository<Apartment, String>{
    Apartment findByApartmentId(String apartmentId);
    List<Apartment> findApartmentByPropertyId(String propertyId);
    List<Apartment> findByTypeOfApartment(String typeOfApartment);
    List<Apartment> findByAlpmId(String alpmId);
}
