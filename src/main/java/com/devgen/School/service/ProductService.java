package com.devgen.School.service;

import com.devgen.School.model.Category;
import com.devgen.School.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component
@Service
public class ProductService {
    private Map<Long, Product> products;

    private long id;

    public ProductService() {
        this.products = new HashMap<>();
        this.id = 1l;
        initalizeProduct();
    }

    private void initalizeProduct() {
        add(new Product(1, "laptop", Category.ELECTRONIC, 100));
        add(new Product(2, "oven", Category.ELECTRONIC, 100));

    }

    public void add(Product product) {
//        products.setId(id);
        products.put(id, product);
        id++;
    }

    public Product getById(Long id) {
        return products.get(id);
    }

    public List<Product> getAll() {
        return new ArrayList<>(products.values());
    }

    public boolean delete(Long id) {
        return products.remove(id) != null;
    }

    public List<Product> searchByCategory(Category category) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getCategory().equals(category)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;  // Fixed: Added return statement
    }
}

