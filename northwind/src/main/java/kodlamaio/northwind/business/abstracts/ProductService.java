package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult< List<Product>> getAll();
	Result add(Product product);
	DataResult<Product> getByProductName(String productName);
	DataResult<Product>  getByProductNameAndCagetory(String productName, int categoryId);
	DataResult<List<Product>> getByProductNameOrCagetory(String productName, int categoryId);
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	DataResult<Product>  getByProductNameContains(String productName);
	DataResult<Product>  getByProductNameStartsWith(String productName);
	

}
