package com.devgen.School.controller;

import com.devgen.School.model.Product;
import com.devgen.School.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController  // @Controller + @ResponceBody (convert java object to json// )
@RequestMapping("api/v1/products")
public class ProductController {

//    @Autowired
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        System.out.println("Product controller get all call.");
        return productService.getAll();
    }
}
