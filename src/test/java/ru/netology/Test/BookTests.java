package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTests {

    Book book_1 = new Book(1, "God emperor of dune", 1, "Frank Gerbert");

    @Test
    public void shouldMatchAuthorPositive() {
        assertEquals(true, book_1.matches("Frank Gerbert"));
    }

    @Test
    public void shouldNotMatchAuthorPositive() {
        assertEquals(false, book_1.matches("Glen Cook"));
    }

//    @Test
//    public void shouldMatchAuthorNegative() {
//        assertEquals(true, book_1.matches("Frank erbert"));
//    }
//
//    @Test
//    public void shouldNotMatchAuthorNegative() {
//        assertEquals(false, book_1.matches("Frank Gerbert"));
//    }

    @Test
    public void shouldMatchNamePositive() {
        assertEquals(true, book_1.matches("God emperor of dune"));
    }

    @Test
    public void shouldNotMatchNamePositive() {
        assertEquals(false, book_1.matches("Children of Dune"));
    }

//    @Test
//    public void shouldMatchNameNegative() {
//        assertEquals(true, book_1.matches("emperor of dune"));
//    }
//
//    @Test
//    public void shouldNotMatchNameNegative() {
//        assertEquals(false, book_1.matches("Children of Dune"));
//    }

    @Test

    public void ShouldGetAllSuperClassMethods() {
        Book book = new Book();
    }

    @Test
    public void shouldCast() {
        Product product = new Book();
        if (product instanceof Book) {
            Book book = (Book) product;
        }
    }

    @Test
    public void shouldUseOverridedMethod() {
        Product product = new Book();
        product.toString();
    }
}