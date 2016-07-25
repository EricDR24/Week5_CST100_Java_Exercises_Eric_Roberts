/** Program:  11.2 Subclasses
  * File:     Employee.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Employee extends Person {
	
	//create data fields
	private int office;
	private double salary;
	private MyDate dateHired;
	
	//constructor for employee
	public Employee(String name, String address, String phone, 
			String email, int office, double salary) {
			super(name, address, phone, email);
			this.office = office;
			this.salary = salary;
			this.dateHired = new MyDate();
	}
	
	//getters
	public int getOffice() {
		return office;
	}
	
	public String getSalary() {
		return String.format("%.2f", salary);
	}
	
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
	}
	
	//setters
	public void setOffice(int office) {
		this.office = office;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDateHired() {
		dateHired = new MyDate();
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
	}
}
