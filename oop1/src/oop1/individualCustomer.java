package oop1;

//Extend: kelime anlami genisletmek demek
//Bireysel musteri aslinda bir musteridir.



public class individualCustomer extends Customer {

	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
