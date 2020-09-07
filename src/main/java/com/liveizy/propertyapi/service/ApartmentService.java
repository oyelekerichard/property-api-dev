/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liveizy.propertyapi.service;

import com.liveizy.propertyapi.dto.enums.Status;
import com.liveizy.propertyapi.dto.input.CreateApartmentInputDto;
import com.liveizy.propertyapi.dto.output.StandardResponseDTO;
import com.liveizy.propertyapi.models.Apartment;
import com.liveizy.propertyapi.models.Properties;
import com.liveizy.propertyapi.repository.ApartmentRepository;
import com.liveizy.propertyapi.repository.PropertyRepository;
import java.util.ArrayList;
import java.util.List;
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
public class ApartmentService extends BaseService {

    @NonNull
    private final ModelMapper modelMapper;

    @NonNull
    @Autowired
    private ApartmentRepository apartmentRepository;

    @NonNull
    @Autowired
    private PropertyRepository propertyRepository;

    public StandardResponseDTO createApartment(CreateApartmentInputDto createApartmentyInputDto) {

        Apartment apartment = modelMapper.map(createApartmentyInputDto, Apartment.class);
        return new StandardResponseDTO(Status.SUCCESS, createApartment(apartmentRepository, apartment));
    }

    public StandardResponseDTO getApartment(String apartmentId) {

        Apartment apartments = apartmentRepository.findByApartmentId(apartmentId);

        if (apartments != null) {
            return new StandardResponseDTO(Status.SUCCESS, apartments);
        } else {
            return new StandardResponseDTO(Status.NO_RECORDS, null);
        }
    }

    public StandardResponseDTO getApartmentsByPropertyId(String propertyId) {

        List<Apartment> apartments = apartmentRepository.findApartmentByPropertyId(propertyId);

        if (apartments != null) {
            return new StandardResponseDTO(Status.SUCCESS, apartments);
        } else {
            return new StandardResponseDTO(Status.NO_RECORDS, null);
        }
    }

    public StandardResponseDTO updateApartments(String apartmentId, Apartment apartment) {
        Apartment apm = apartmentRepository.findByApartmentId(apartmentId);

        if (apm != null) {
            apm.setFloorFinishing(apartment.getFloorFinishing());
            apm.setNumberOfBathrooms(apartment.getNumberOfBathrooms());
            apm.setNumberOfRooms(apartment.getNumberOfRooms());
            apm.setNumberOfRoomsEnsuite(apartment.getNumberOfRoomsEnsuite());
            apm.setNumberOfSittingRooms(apartment.getNumberOfSittingRooms());
            return new StandardResponseDTO(Status.SUCCESS, apm);
        } else {
            return new StandardResponseDTO(Status.NO_RECORDS, null);
        }
    }

    public StandardResponseDTO addApartmentToProperty(String propertyId, String apartmentId) {
        Apartment pm = apartmentRepository.findByApartmentId(apartmentId);

        Properties prop = propertyRepository.findByUuid(propertyId);

        List<Apartment> apartmentList = new ArrayList<>();

        apartmentList.add(pm);

        prop.setApartments(apartmentList);

        return new StandardResponseDTO(Status.SUCCESS, prop);

    }

    private StandardResponseDTO create(ApartmentRepository apartmentRepository, Apartment apartment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
