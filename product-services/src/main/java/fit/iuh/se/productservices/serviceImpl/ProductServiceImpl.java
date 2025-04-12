package fit.iuh.se.productservices.serviceImpl;

import fit.iuh.se.productservices.entity.Product;
import fit.iuh.se.productservices.repository.ProductRepository;
import fit.iuh.se.productservices.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository proRepo;
    @Autowired
    public ProductServiceImpl(ProductRepository proRepo) {
        this.proRepo = proRepo;
    }

    @Override
    public Product save(Product product) {
        return proRepo.save(product);
    }

    @Override
    public Product findById(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }
}
