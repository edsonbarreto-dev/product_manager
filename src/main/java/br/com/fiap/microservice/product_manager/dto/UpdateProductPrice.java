package br.com.fiap.microservice.product_manager.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductPrice {
    private Long productId;
    private BigDecimal price;
}
