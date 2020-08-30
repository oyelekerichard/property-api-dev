/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.repository;

import com.liveizy.propertyapi.models.Tenant;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author richard.oyeleke
 */
@Repository
public interface TenantRepository extends PagingAndSortingRepository<Tenant, String> {
    
    Tenant findByTenantId(String tenantId);
}
