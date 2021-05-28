package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	Product getByProductName(String productName);
	
	Product getByProductNameAndCagetory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCagetory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	Product getByProductNameContains(String productName);
	
	Product getByProductNameStartsWith(String productName);
	
	@Query("From Product where prodcutName=:productName and category.categoryId=:categoryId ")
	
	List<Product> getByNameAndCategory(String productName, int categoryId);
}
