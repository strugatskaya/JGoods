package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.Exception.NotFoundException;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTests {
    private ProductRepository repository = new ProductRepository();
    Book book_1 = new Book(1, "Children of Dune", 1, "Frank Gerbert");
    Book book_2 = new Book(0, "The Black company", 2, "Glen Cook");
    Smartphone smartphone_1 = new Smartphone(100, "Galaxy S10", 70_000, "Samsung");
    Smartphone smartphone_2 = new Smartphone(102, "IPhone 12", 100_000, "Apple");

    @Test
    public void ShouldFailTestAndThrowException() {
        repository.save(book_1);
        repository.save(book_2);
        repository.save(smartphone_1);
        repository.save(smartphone_2);
        repository.removeById(666);
    }

    @Test
    public void ShouldThrowExceptionNegativeId() {
        repository.save(book_1);
        repository.save(book_2);
        repository.save(smartphone_1);
        repository.save(smartphone_2);
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(-1);
        });
    }
}
