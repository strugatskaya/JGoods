package ru.netology.Test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTests {

    ProductRepository productRepository = new ProductRepository();
    ProductManager productManager = new ProductManager(productRepository);


    Book book_1 = new Book(1, "Children of Dune", 1, "Frank Gerbert");
    Book book_2 = new Book(0, "The Black company", 2, "Glen Cook");
    Smartphone smartphone_1 = new Smartphone(100, "Galaxy S10", 70_000, "Samsung");
    Smartphone smartphone_2 = new Smartphone(102, "IPhone 12", 100_000, "Apple");

    @Test
    void ShouldSearchOnePositive() {
        ProductManager productManager = new ProductManager(productRepository);
        productManager.add(book_1);
        productManager.add(book_2);
        productManager.add(smartphone_1);
        productManager.add(smartphone_2);

        assertArrayEquals(new Product[]{book_1}, productManager.searchBy("Children of Dune"));
    }

//    @Test
//    void ShouldSearchOneNegative() {
//        productManager.add(book_1);
//        productManager.add(book_2);
//        productManager.add(smartphone_1);
//        productManager.add(smartphone_2);
//        assertArrayEquals(new Product[]{smartphone_1}, productManager.searchBy("Help Me!"));
}
