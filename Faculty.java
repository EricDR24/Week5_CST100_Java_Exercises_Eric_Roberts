/** Program:  11.2 Subclasses
  * File:     Facutly.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Faculty extends Employee {
	
	//data fields
	private String officeHours;
	private String rank;
	
	//constructor for Faculty
	public Faculty(String name, String address, String phone, String email, 
			int office, double salary, String officeHours, String rank) {
			super(name, address, phone, email, office, salary);
			this.officeHours = officeHours;
			this.rank = rank;
		}
	
	//getters
	public String getRank() {
		return rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	//setters
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	
	//return string
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours +"\nRank: " + rank;
	}

}
