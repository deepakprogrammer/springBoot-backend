package restAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import restAPI.models.Product;
import restAPI.reprositories.ProductRepo;

@RestController
@CrossOrigin(origins = "*")
public class MyRestController {
	
	private ProductRepo productRepo;
	@Autowired
	private ProductRepo setProductRepo(ProductRepo productRepo) {
		return this.productRepo = productRepo;
	}
	@GetMapping(value = "/products", produces = {"application/json"})
	public ResponseEntity<List<Product>> getAllProducts(){
		return new ResponseEntity<>(productRepo.findAll(),HttpStatus.OK );
	}
}
