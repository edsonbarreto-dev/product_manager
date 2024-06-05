package br.com.fiap.microservice.product_manager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
@Jacksonized
@AllArgsConstructor
@NoArgsConstructor
public class AddProduct {
    private String name;
    private String description;
    private int QuantityStock;
    private BigDecimal price;
}
