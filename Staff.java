/** Program:  11.2 Subclasses
  * File:     Staff.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Staff extends Employee {
	
	//create Data fields
	private String title;
	
	//constructor
	public Staff(String name, String address, String phone,  
			String email, int office, double salary, String title) {
			super(name, address, phone, email, office, salary);
			this.title = title;
		}
	
	//getters
	public String getTitle() {
		return title;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	//return string
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}

}
