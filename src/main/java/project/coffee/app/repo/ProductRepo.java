package project.coffee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.coffee.app.model.product.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

	Product findProductById(Long id);
		
}
