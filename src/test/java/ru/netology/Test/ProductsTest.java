package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductsTest {

    Product product_1 = new Product(0, "God emperor of dune", 1);

    @Test
    public void shouldMatchPositive() {
        assertEquals(true, product_1.matches("God emperor of dune"));
    }

    @Test
    public void shouldNotMatchPositive() {
        assertEquals(false, product_1.matches("Children of Dune"));
    }

//    @Test
//    public void shouldMatchNegative() {
//        assertEquals(true, product_1.matches("od emperor of dune"));
//    }

//    @Test
//    public void shouldNotMatchNegative() {
//        assertEquals(false, product_1.matches("God emperor of dune"));
//    }

    @Test
    public void shouldUseEqualsNamePositive() {
        Product first = new Product(0, "Children of Dune", 466);
        Product second = new Product(0, "Children of Dune", 466);
        assertEquals(first, second);
    }

//    @Test
//    public void shouldUseEqualsNameNegative() {
//        Product first = new Product(0, "Children of Dune", 466);
//        Product second = new Product(0, "hildren od Dune", 466);
//        assertEquals(first, second);
//    }

    @Test
    public void shouldUseEqualsIDPositive() {
        Product first = new Product(0, "Children of Dune", 466);
        Product second = new Product(0, "Children of Dune", 466);
        assertEquals(first, second);
    }
}
//    @Test
//    public void shouldUseEqualsIdNegative() {
//        Product first = new Product(0, "Children of Dune", 466);
//        Product second = new Product(1, "hildren od Dune", 466);
//        assertEquals(first, second);
//    }
//}