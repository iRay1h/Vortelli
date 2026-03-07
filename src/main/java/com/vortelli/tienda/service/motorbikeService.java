package com.vortelli.tienda.service;

import org.springframework.stereotype.Service;

import com.vortelli.tienda.dto.MotorbikeRequest;
import com.vortelli.tienda.dto.MotorbikeResponse;
import com.vortelli.tienda.entity.MotorbikeEntity;
import com.vortelli.tienda.repository.MotorbikeRepository;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor

public class motorbikeService {

    private final MotorbikeRepository motorbikeRepository;

    public MotorbikeResponse CreateMotorbike(MotorbikeRequest motorbike){

        MotorbikeEntity motorbikeEntity = new MotorbikeEntity();

        motorbikeEntity.setBrand(motorbike.getBrand());
        motorbikeEntity.setModel(motorbike.getModel());
        motorbikeEntity.setCubicCentimeters(motorbike.getCubicCentimeters());
        motorbikeEntity.setPrice(motorbike.getPrice());
        motorbikeEntity.setQuantity(motorbike.getQuantity());

        motorbikeRepository.save(motorbikeEntity);

        MotorbikeResponse response = new MotorbikeResponse();

        response.setBrand(motorbike.getBrand());
        response.setModel(motorbike.getModel());
        response.setCubicCentimeters(motorbike.getCubicCentimeters());
        response.setPrice(motorbike.getPrice());
        response.setQuantity(motorbike.getQuantity());

        return response;

    }
    
}
