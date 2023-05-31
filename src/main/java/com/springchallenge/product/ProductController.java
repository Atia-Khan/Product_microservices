package com.springchallenge.product;

import com.springchallenge.product.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductRepository productrepo;

    // correct
    @GetMapping("/all")
    public List<Product> viewAllProducts() {
        return productrepo.findAll();
    }

    // correct
    @GetMapping("/{Id}")
    public String getProductById(@PathVariable Long Id) {
        this.productrepo.findById(Id);
        return "_Product Find Out by" + Id;
    }

    @GetMapping("/{name}")
    public String getProductByName(@PathVariable("name") String name) {
        this.productrepo.findByName(name);
        return "Success"; // Or return any other meaningful response
    }
    // correct

    @PostMapping("/add")
    public void addProduct(@RequestBody Product addProductList) {
        this.productrepo.save(addProductList);
    }
    //correct
    @PutMapping("/update")
    public void updateProduct(@RequestBody Product updated) {
        this.productrepo.save(updated);
    }
    //correct It was done by ID not by requestbody
    @DeleteMapping("/{Id}")
    public void deleteProduct(@PathVariable Long Id) {
        this.productrepo.findById(Id);
    }
}
