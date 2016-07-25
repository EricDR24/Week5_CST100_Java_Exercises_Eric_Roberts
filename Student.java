/** Program:  11.2 Subclasses
  * File:     Student.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Student extends Person {
	
	//create FINAL integers
	private int status;
	public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;
	
	public Student(String name, String address,  
	String phone, String email, int status) {
	super(name, address, phone, email);
	this.status = status;
}
	
	//setter for new status
	public void setStatus(int status) {
		this.status = status;
	}
	
	//print status
	public String getStatus() {
		switch (status) {
			case 1 : return "freshman"; 
			case 2 : return "sophomore"; 
			case 3 : return "junior"; 
			case 4 : return "senior";
			default : return "Unknown"; 
		}
	}
	
	//print string
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}