package Test.demo.service;

import Test.demo.model.Product;
import Test.demo.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts() {
        List<Product> products = (List<Product>) productRepository.findAll();
        return products;
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public void deleteProductById(Integer id) {
        productRepository.deleteById(id);
    }
}

