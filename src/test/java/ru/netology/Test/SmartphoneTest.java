package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {


    Smartphone smartphone_1 = new Smartphone(1, "Galaxy S10", 11, "Samsung");

    @Test
    public void shouldMatchProducerPositive() {
        assertEquals(true, smartphone_1.matches("Samsung"));
    }

    @Test
    public void shouldNotMatchProducerPositive() {
        assertEquals(false, smartphone_1.matches("Apple"));
    }

//    @Test
//    public void shouldMatchProducerNegative() {
//        assertEquals(true, smartphone_1.matches("amsung"));
//    }
//
//    @Test
//    public void shouldNotMatchProducerNegative() {
//        assertEquals(false, smartphone_1.matches("Samsung"));
//    }

    @Test
    public void shouldMatchNamePositive() {
        assertEquals(true, smartphone_1.matches("Galaxy S10"));
    }

    @Test
    public void shouldNotMatchNamePositive() {
        assertEquals(false, smartphone_1.matches("alaxy s10"));
    }

//    @Test
//    public void shouldMatchNameNegative() {
//        assertEquals(true, smartphone_1.matches("alaxy s10"));
//    }

//    @Test
//    public void shouldNotMatchNameNegative() {
//        assertEquals(false, smartphone_1.matches("Galaxy S10"));
//    }

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