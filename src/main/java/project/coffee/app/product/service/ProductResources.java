package project.coffee.app.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.product.Product;

@RestController
@RequestMapping("/product")
public class ProductResources {

	private final productService productService;

	@Autowired
	public ProductResources(productService productService) {
		this.productService = productService;
	}

	@PutMapping("/addProduct")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product newProduct = productService.addProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED);

	}

	@PutMapping("/updateProduct")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		Product newProduct = productService.updateProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAllProducts() {
		List<Product> newProduct = productService.findAllProducts();
		return new ResponseEntity<>(newProduct, HttpStatus.OK);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
		Product product = productService.findProductById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}
