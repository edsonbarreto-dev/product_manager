package br.com.fiap.microservice.product_manager.model;

import br.com.fiap.microservice.product_manager.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.assertj.core.api.Assertions.fail;
import static org.mockito.Mockito.*;

class ProductTest {

    @Mock
    private ProductRepository productRepository;

    AutoCloseable openMocks;

    @BeforeEach
    void setUp() {
        openMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        openMocks.close();
    }

    @Test
    void devePermitirListarProdutos() {
        // Arrange
        var list = new ArrayList<Product>();
        var product = Product
                .builder()
                .productId(1L)
                .name("Product 1")
                .price(new BigDecimal("1.00"))
                .description("Description product 1")
                .QuantityStock(2)
                .build();
        list.add(product);

        when(productRepository.findAll()).thenReturn(list);

       // Action
        var products = productRepository.findAll();

       // Assert
        Assertions.assertThat(product).isNotNull();
        Assertions.assertThat(products).hasSize(1);
        verify(productRepository, times(1)).findAll();

    }

    @Test
    void devePermitirIncluirUmProduto() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirAlterarUmProduto() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirReservarUmProdutoRetirandoEleDoEstoque() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirIncluirVariosProdutosDeUmaLista() {
        fail("Not yet implemented");
    }

    @Test
    void devePermitirAtualizarOPrecoDoProduto() {
        fail("Not yet implemented");
    }

}