package com.telekom.ecare.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;

    private String name;

    private Long categoryId;

    private Double price;

    private Double weight;

    private String description;

    private String imageName;
}
