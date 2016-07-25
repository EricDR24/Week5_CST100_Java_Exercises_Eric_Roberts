/** Program:  11.2 Subclasses
  * File:     Person.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Person {
	
	//create private data fields
	private String name;
	private String address;
	private String phone;
	private String email;

	//construct default Person
	public Person() {
		this("Unknown","Unknown","Unknown","Unknown");
	}

	// construct Person with specified name, address, phone and email
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	//getters
	public String getName() {
		return name;
	}

	
	public String getAddress() {
		return address;
	}

	
	public String getPhone() {
		return phone;
	}

	
	public String getEmail() {
		return email;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}

	
	public void setAddress(String address) {
		this.address = address;
	}

	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}

