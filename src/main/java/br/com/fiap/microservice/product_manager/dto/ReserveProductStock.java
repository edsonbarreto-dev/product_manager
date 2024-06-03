package br.com.fiap.microservice.product_manager.dto;

import lombok.Data;

@Data
public class ReserveProductStock {
    private Long productId;
    private int QuantityRequired;
}
