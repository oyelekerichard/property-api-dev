/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.dto.enums.Status;
import com.liveizy.propertyapi.dto.input.CreateUserInputDto;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Users;
import com.liveizy.propertyapi.repository.PropertyRepository;
import com.liveizy.propertyapi.repository.UserRepository;
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
public class UserService extends BaseService{
    
    @NonNull
    private final ModelMapper modelMapper;

    @NonNull
    @Autowired
    private final UserRepository userRepository;
    
    public StandardResponseDTO createUser(CreateUserInputDto createuserInputDto){

        Users users = modelMapper.map(createuserInputDto, Users.class);
        return new StandardResponseDTO(Status.SUCCESS, users);
    }
}
