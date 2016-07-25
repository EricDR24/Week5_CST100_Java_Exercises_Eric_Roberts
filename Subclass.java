/** Program:  11.2 Subclasses
  * File:     Person.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
public class Subclass {

	public static void main(String[] args) {
		
		//create Person, Student, Employee, Faculty, Staff
		Person person = new Person("Eric", "1881 Stack street", 
				"1474359989", "Eric1@aol.com");

			Student student = new Student("Jessica", "13 Green Ave", "2169493233", 
				"Jessica1@aol.com", Student.FRESHMAN);

			Employee employee = new Employee("Ella", "3 Pony street", "5189392938",
				"Ella1@aol.com", 81, 63234);

			Faculty faculty = new Faculty("Ivy", "1 Sweet street", "2143730313",
				"Ivy1@aol.com", 123, 52456, "8am to 6pm", "Professor");

			Staff staff = new Staff("Dan", "1991 Chicken road", "2134573567",
				"Dan1@aol.com", 432, 45570, "Executive Assistant");

	
	
	//print results
	System.out.println(person.toString());
	System.out.println(student.toString());
	System.out.println(employee.toString());
	System.out.println(faculty.toString());
	System.out.println(staff.toString());
			
	}
	
}
