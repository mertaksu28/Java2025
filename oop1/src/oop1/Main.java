package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		// set value(Deger atamak)
		product1.setName("A Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitInStock(3);
		product1.setImageUrl("kave.jpg");

		// get value(Degerleri okuma)
		// System.out.println(product1.name);

		Product product2 = new Product();

		product2.setName("B Kahve Makinesi");
		product2.setUnitPrice(4000);
		product2.setDiscount(2);
		product2.setUnitInStock(1);
		product2.setImageUrl("bkave.jpg");

		Product product3 = new Product();

		product3.setName("C Kahve Makinesi");
		product3.setUnitPrice(5000);
		product3.setDiscount(2);
		product3.setUnitInStock(9);
		product3.setImageUrl("ckave.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		individualCustomer individualCustomer = new individualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("1234");
		individualCustomer.setPhoneNumber("470333333");
		individualCustomer.setFirstName("Mert");
		individualCustomer.setLastName("Aksu");

		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("AKSU HOLDING");
		corparateCustomer.setPhoneNumber("1234556");
		corparateCustomer.setCustomerNumber("4321");
		corparateCustomer.setTaxNumber("98765");
		
		Customer[] customers = {individualCustomer, corparateCustomer};
	}

}
