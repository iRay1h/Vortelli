package com.vortelli.tienda.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vortelli.tienda.entity.MotorbikeEntity;

public interface MotorbikeRepository extends JpaRepository<MotorbikeEntity, Long>{
    
}
