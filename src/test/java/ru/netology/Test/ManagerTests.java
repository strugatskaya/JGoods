package ru.netology.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTests {
    @BeforeEach
    public void setUp() {
        ProductManager productManager = new ProductManager(productRepository);
        productManager.add(book1);
        productManager.add(book2);
        productManager.add(smartphone1);
        productManager.add(smartphone2);
        productManager.add(smartphone666);
    }

    ProductRepository productRepository = new ProductRepository();
    Book book1 = new Book(1, "Children of Dune", 70, "Frank Gerbert");
    Book book2 = new Book(0, "The Black company", 70, "Glen Cook");
    Smartphone smartphone1 = new Smartphone(100, "Galaxy S10", 70_000, "Samsung");
    Smartphone smartphone2 = new Smartphone(102, "IPhone 12", 100_000, "Apple");
    Smartphone smartphone666 = new Smartphone(103, "Galaxy S21", 120_000, "Samsung");

    @Test
    void shouldSearchBookName() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{book1}, productManager.searchBy("Children of Dune"));
    }

    @Test
    void shouldSearchAuthor() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{book2}, productManager.searchBy("Glen Cook"));
    }

    @Test
    void shouldSearchProducer() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{smartphone1, smartphone666}, productManager.searchBy("Samsung"));
    }

    @Test
    void shouldSearchSmartphoneName() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{smartphone2}, productManager.searchBy("IPhone 12"));
    }

    @Test
    void shouldSearchAmongSeveralSimilarResults() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{smartphone1, smartphone666}, productManager.searchBy("Samsung"));
    }

    @Test
    void searchByTestEmptyArray() {
        ProductManager productManager = new ProductManager(productRepository);
        assertArrayEquals(new Product[]{}, productManager.searchBy("Спасибо вам большое, Ксения, что объясняете!"));
    }
}

