/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.repository.AlpmRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author richard.oyeleke
 */
@Service
@RequiredArgsConstructor
public class AlpmService extends BaseService {
    
    @NonNull
    private final ModelMapper modelMapper;

    @NonNull
    @Autowired
    private final AlpmRepository alpmRepository;
    
    
}
