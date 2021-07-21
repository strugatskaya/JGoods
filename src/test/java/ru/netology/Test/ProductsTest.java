package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductsTest {

    Product product1 = new Product(0, "God emperor of dune", 1);

    @Test
    public void shouldMatchPositive() {
        assertTrue(product1.matches("God emperor of dune"));
    }

    @Test
    public void shouldNotMatchPositive() {
        assertFalse(product1.matches("Children of Dune"));
    }

    @Test
    public void shouldUseEqualsNamePositive() {
        Product first = new Product(0, "Children of Dune", 466);
        Product second = new Product(0, "Children of Dune", 466);
        assertEquals(first, second);
    }

    @Test
    public void shouldUseEqualsIDPositive() {
        Product first = new Product(0, "Children of Dune", 466);
        Product second = new Product(0, "Children of Dune", 466);
        assertEquals(first, second);
    }
}