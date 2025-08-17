package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// Database access operations
public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		System.out.println("Item added to database with JDBC " + product.getName());
	}
}
