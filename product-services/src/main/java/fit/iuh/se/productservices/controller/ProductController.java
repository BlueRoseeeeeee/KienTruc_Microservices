package fit.iuh.se.productservices.controller;

import fit.iuh.se.productservices.entity.Product;
import fit.iuh.se.productservices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductService proService;
    @Autowired
    public ProductController(ProductService proService) {
        this.proService = proService;
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return proService.save(product);
    }
    @GetMapping
    public List<Product> findAll() {
        return proService.findAll();
    }
}
