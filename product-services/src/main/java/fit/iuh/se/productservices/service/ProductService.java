package fit.iuh.se.productservices.service;

import fit.iuh.se.productservices.entity.Product;

import java.util.List;

public interface ProductService {
    public Product save(Product product);
    public Product findById(Long id);
    public List<Product> findAll();
}
