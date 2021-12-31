package restAPI.reprositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import restAPI.models.Product;

public interface ProductRepo extends MongoRepository<Product, String> {

}
