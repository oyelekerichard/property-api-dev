package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.dto.enums.Status;
import com.liveizy.propertyapi.dto.input.CreatePropertyInputDto;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Properties;
import com.liveizy.propertyapi.repository.PropertyRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PropertyService extends BaseService{

    @NonNull
    private final ModelMapper modelMapper;

    @NonNull
    @Autowired
    private final PropertyRepository propertyRepository;

    public StandardResponseDTO createProperty(CreatePropertyInputDto createPropertyInputDto){

        Properties properties = modelMapper.map(createPropertyInputDto, Properties.class);
        return new StandardResponseDTO(Status.SUCCESS, create(propertyRepository, properties));
    }

    public StandardResponseDTO getPropertiesByCreator(String createdBy) {
        
        List<Properties> property = propertyRepository.findByCreatedBy(createdBy);

         if(property != null)
         {
         return new StandardResponseDTO(Status.SUCCESS, property);
         }
         else return new StandardResponseDTO(Status.NO_RECORDS, property);
    }
    
    public StandardResponseDTO getPropertyByPropertyId(String propertyId) {
        
        Properties property = propertyRepository.findByUuid(propertyId);

         if(property != null)
         {
         return new StandardResponseDTO(Status.SUCCESS, property);
         }
         else return new StandardResponseDTO(Status.NO_RECORDS, property);
    }

    public StandardResponseDTO updateProperty(String propertyId, Properties properties) 
    {
        Properties prop = propertyRepository.findByUuid(propertyId);
        
        
        return new StandardResponseDTO(Status.SUCCESS, this);
    }

}
