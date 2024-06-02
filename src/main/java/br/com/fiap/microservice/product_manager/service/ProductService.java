package br.com.fiap.microservice.product_manager.service;

import br.com.fiap.microservice.product_manager.exception.ProductNotFound;
import br.com.fiap.microservice.product_manager.model.Product;
import br.com.fiap.microservice.product_manager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id).orElseThrow(ProductNotFound::new);
    }

    public Product updateProduct(Product product) {
        Product productFound = productRepository.findById(product.getProductId()).orElseThrow(ProductNotFound::new);
        productFound.setName(product.getName());
        productFound.setDescription(product.getDescription());
        productFound.setQuantityStock(product.getQuantityStock());
        productFound.setPrice(product.getPrice());
        return productRepository.save(productFound);
    }

    public Product updatePriceProduct(Long productId, BigDecimal price) {
        Product product = this.findProductById(productId);
        product.setPrice(price);
        this.updateProduct(product);
        return product;
    }

    public Product updateStockProduct(Long productId, int quantityStock) {
        Product product = this.findProductById(productId);
        product.setQuantityStock(quantityStock);
        this.updateProduct(product);
        return product;
    }
}
