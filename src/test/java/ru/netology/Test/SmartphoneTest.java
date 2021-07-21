package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartphoneTest {

    Smartphone smartphone1 = new Smartphone(1, "Galaxy S10", 11, "Samsung");
    Smartphone smartphone2 = new Smartphone(102, "IPhone 12", 100_000, "Apple");

    @Test
    public void shouldMatchProducerPositive() {
        assertTrue(smartphone1.matches("Samsung"));
    }

    @Test
    public void shouldNotMatchProducerPositive() {
        assertFalse(smartphone2.matches("Samsung"));
    }

    @Test
    public void shouldMatchNamePositive() {
        assertTrue(smartphone1.matches("Galaxy S10"));
    }

    @Test
    public void shouldNotMatchNamePositive() {
        assertFalse(smartphone2.matches("Galaxy s10"));
    }

    @Test
    public void ShouldGetAllSuperClassMethods() {
        Smartphone smartphone = new Smartphone();
    }

    @Test
    public void shouldCast() {
        Product product = new Smartphone();
        if (product instanceof Smartphone) {
            Smartphone book = (Smartphone) product;
        }
    }
}