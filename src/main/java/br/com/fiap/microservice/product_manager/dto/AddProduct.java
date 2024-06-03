package br.com.fiap.microservice.product_manager.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProduct {
    private String name;
    private String description;
    private int QuantityStock;
    private BigDecimal price;
}
