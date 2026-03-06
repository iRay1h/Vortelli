package com.vortelli.tienda.dto;

import lombok.Data;

@Data

public class motorbikeRequest {
    private String brand;

    private String model;

    private Integer cubicCentimeters;

    private Integer price;

    private Integer quantity;

}
