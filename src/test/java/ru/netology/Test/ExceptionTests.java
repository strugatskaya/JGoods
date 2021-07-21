package ru.netology.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Exception.NotFoundException;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTests {
    @BeforeEach
    public void setUp() {
        repository.save(book1);
        repository.save(book2);
        repository.save(smartphone1);
        repository.save(smartphone2);
    }

    private ProductRepository repository = new ProductRepository();
    Book book1 = new Book(1, "Children of Dune", 1, "Frank Gerbert");
    Book book2 = new Book(0, "The Black company", 2, "Glen Cook");
    Smartphone smartphone1 = new Smartphone(100, "Galaxy S10", 70_000, "Samsung");
    Smartphone smartphone2 = new Smartphone(101, "IPhone 12", 100_000, "Apple");

    @Test
    public void shouldThrowAnException() {
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(666);
        });
    }
}
