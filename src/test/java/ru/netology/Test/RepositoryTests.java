package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

public class RepositoryTests {

    private ProductRepository repository = new ProductRepository();
    Book book_1 = new Book(1, "Children of Dune", 1, "Frank Gerbert");
    Book book_2 = new Book(0, "The Black company", 2, "Glen Cook");
    Smartphone smartphone_1 = new Smartphone(100, "Galaxy S10", 70_000, "Samsung");
    Smartphone smartphone_2 = new Smartphone(102, "IPhone 12", 100_000, "Apple");


    @Test
    public void shouldSaveProduct() {
        repository.save(book_1);
        repository.save(book_2);
        repository.save(smartphone_1);
        repository.save(smartphone_2);
    }

    @Test
    public void shouldRemoveIdProductPositive() {
        repository.save(book_1);
        repository.save(book_2);
        repository.save(smartphone_1);
        repository.save(smartphone_2);
        repository.removeById(0);

//        assertArrayEquals(new Product[]{book_1, book_2, smartphone_1, smartphone_2}, repository.findAll());
    }
}
//    @Test
//    public void ShouldRemoveIdNegativeId() {
//        repository.save(book_1);
//        repository.save(book_2);
//        repository.save(smartphone_1);
//        repository.save(smartphone_2);
//        repository.removeById(666);
//        };
//    }

