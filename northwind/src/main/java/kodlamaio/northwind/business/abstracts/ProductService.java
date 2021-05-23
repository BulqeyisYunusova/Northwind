package kodlamaio.northwind.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult< List<Product>> getAll();
	Result add(Product product);

}
