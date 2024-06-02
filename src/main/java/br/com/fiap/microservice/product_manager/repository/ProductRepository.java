package br.com.fiap.microservice.product_manager.repository;

import br.com.fiap.microservice.product_manager.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
