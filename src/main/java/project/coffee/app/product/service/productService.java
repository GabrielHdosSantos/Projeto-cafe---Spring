package project.coffee.app.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffee.app.model.product.Product;
import project.coffee.app.repo.ProductRepo;

@Service
@Transactional
public class productService {

	private final ProductRepo repo;

	@Autowired
	public productService(ProductRepo repo) {
		this.repo = repo;
	}

	public Product addProduct(Product product) {
		return repo.save(product);

	}

	public Product updateProduct(Product product) {
		return repo.save(product);
	}

	public List<Product> findAllProducts() {
		return repo.findAll();
	}

	public Product findProductById(Long id) {
		return repo.findProductById(id);

	}

}
