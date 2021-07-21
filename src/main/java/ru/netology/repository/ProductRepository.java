package ru.netology.repository;

import ru.netology.domain.Product;
import ru.netology.Exception.NotFoundException;

public class ProductRepository {
    public Product[] items = new Product[0];

    public void save(Product item) {
        int length = items.length + 1;
        Product[] tmp = new Product[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Product[] findAll() {

        return items;
    }

    public Product findById(int id) {
        for (Product item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void removeById(int id) throws NotFoundException {

        int lenght = items.length - 1;
        Product[] tmp = new Product[lenght];
        int index = 0;
        if (findById(id) == null) {
            throw new NotFoundException("Element with: " + id + " is not found");
        } else {
            for (Product item : items) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }
    }
}
