package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTests {

    Book book1 = new Book(1, "Children of Dune", 1, "Frank Gerbert");
    Book book2 = new Book(0, "The Black company", 2, "Glen Cook");

    @Test
    public void shouldMatchAuthor() {
        assertTrue(book2.matches("Glen Cook"));
    }

    @Test
    public void shouldNotMatchAuthor() {
        assertFalse(book1.matches("Joanne Rowling"));
    }

    @Test
    public void shouldMatchNamePositive() {
        assertTrue(book2.matches("The Black company"));
    }

    @Test
    public void shouldNotMatchNamePositive() {
        assertFalse(book1.matches("Harry Potter and The Deathly Hallows"));
    }

    @Test

    public void shouldGetAllSuperClassMethods() {
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