package com.vortelli.tienda.entity;


    @Entity
    @Data
    @Table(name = "motorbike")
    public class motorbikeEntity {
        @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
     // el colum es para saber a que columna tiene que ir a guardar datos o hacer otras funcionalidades
    @Column(name = "id")
    private Long id;
    private String branch;
    private String model;
    private Integer cubicCentimeters;
    private Integer price;
    private Integer quantity;

    }
