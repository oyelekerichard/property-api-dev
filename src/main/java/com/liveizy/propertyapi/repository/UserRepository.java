/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.repository;

import com.liveizy.propertyapi.models.Users;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author richard.oyeleke
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<Users, String>{
    Users findUserById(String id);
//    Users findUserByLiveizyId(String liveizy_id);
    Users findUserByEmail(String emailAddress);
}
