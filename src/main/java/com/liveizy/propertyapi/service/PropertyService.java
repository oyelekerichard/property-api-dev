package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.dto.enums.Status;
import com.liveizy.propertyapi.dto.input.CreatePropertyInputDto;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Properties;
import com.liveizy.propertyapi.repository.PropertyRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService extends BaseService{

    @NonNull
    private final ModelMapper modelMapper;

    @NonNull
    private final PropertyRepository propertyRepository;

    public StandardResponseDTO createProperty(CreatePropertyInputDto createPropertyInputDto){

        Properties properties = modelMapper.map(createPropertyInputDto, Properties.class);
        return new StandardResponseDTO(Status.SUCCESS, create(propertyRepository, properties));
    }

}
