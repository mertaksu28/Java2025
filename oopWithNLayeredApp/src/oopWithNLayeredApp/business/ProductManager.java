package oopWithNLayeredApp.business;



import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

//Business rules
//Response request pattern
//When a layer uses another layer's class, it should access it only through its interface.
public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price cannot be less than $10");
		}

		// ProductDao productDao = new JdbcProductDao(); Bad code

		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}

}
