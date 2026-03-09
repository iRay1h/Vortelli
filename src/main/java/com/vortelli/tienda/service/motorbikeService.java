package com.vortelli.tienda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vortelli.tienda.dto.MotorbikeRequest;
import com.vortelli.tienda.dto.MotorbikeResponse;
import com.vortelli.tienda.entity.MotorbikeEntity;
import com.vortelli.tienda.repository.MotorbikeRepository;

import lombok.RequiredArgsConstructor;

@Service

@RequiredArgsConstructor

public class MotorbikeService {

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

        response.setId(motorbike.getId());
        response.setBrand(motorbike.getBrand());
        response.setModel(motorbike.getModel());
        response.setCubicCentimeters(motorbike.getCubicCentimeters());
        response.setPrice(motorbike.getPrice());
        response.setQuantity(motorbike.getQuantity());

        return response;

    }

    public List<MotorbikeResponse> MotorbikeList(){

        List<MotorbikeEntity> motorbikes = motorbikeRepository.findAll();

        List<MotorbikeResponse> List = new ArrayList<>();

        for (MotorbikeEntity motorbike : motorbikes) {

            MotorbikeResponse response = new MotorbikeResponse();

            response.setId(motorbike.getId());
            response.setBrand(motorbike.getBrand());
            response.setModel(motorbike.getModel());
            response.setCubicCentimeters(motorbike.getCubicCentimeters());
            response.setPrice(motorbike.getPrice());
            response.setQuantity(motorbike.getQuantity());

            List.add(response);

        }

        return List;

    }

    public MotorbikeResponse MotorbikeSearch(int id) {

        List<MotorbikeEntity> motorbikes = motorbikeRepository.findAll();

        for (MotorbikeEntity motorbike : motorbikes) {

            if (motorbike.getId() == id) {
                
                MotorbikeResponse response = new MotorbikeResponse();

                response.setId(motorbike.getId());
                response.setBrand(motorbike.getBrand());
                response.setModel(motorbike.getModel());
                response.setCubicCentimeters(motorbike.getCubicCentimeters());
                response.setPrice(motorbike.getPrice());
                response.setQuantity(motorbike.getQuantity());

                return response;

            }
            
        }
        
        return null;
        
    }

    public MotorbikeResponse MotorbikeUpdate(int id, MotorbikeRequest NewMotorbike){

        List<MotorbikeEntity> motorbikes = motorbikeRepository.findAll();

        for (MotorbikeEntity motorbike : motorbikes) {

            if (motorbike.getId() == id) {
                
                motorbike.setBrand(NewMotorbike.getBrand());
                motorbike.setModel(NewMotorbike.getModel());
                motorbike.setCubicCentimeters(NewMotorbike.getCubicCentimeters());
                motorbike.setPrice(NewMotorbike.getPrice());
                motorbike.setQuantity(NewMotorbike.getQuantity());

                motorbikeRepository.save(motorbike);

                MotorbikeResponse response = new MotorbikeResponse();
                response.setId(motorbike.getId());
                response.setBrand(motorbike.getBrand());
                response.setModel(motorbike.getModel());
                response.setCubicCentimeters(motorbike.getCubicCentimeters());
                response.setPrice(motorbike.getPrice());
                response.setQuantity(motorbike.getQuantity());

                return response;

            }

        }

        return null;

    }

    public boolean DeleteMotorbike(int id){

        List<MotorbikeEntity> motorbikes = motorbikeRepository.findAll();

        for (MotorbikeEntity motorbike : motorbikes) {

            if (motorbike.getId() == id) {

                motorbikeRepository.delete(motorbike);

                return true;

            }

        }

        return false;

    }
    
}
