/** Program:  11.2 Subclasses
  * File:     MyDate.java 
  * Summary:  Chapter 11, Exercise 2, Create the person, student, employee, faculty and staff
  * Author:   Eric Roberts
  * Date:     July 22, 2016
**/
import java.util.GregorianCalendar;

public class MyDate {
	
	//data fields
	private int year;
	private int month;
	private int day;
	
	//create MyDate
	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	//elapsedTime for MyDate
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}
	
	//create year, month, day
	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	//getters
	public int getYear() {
		return year;
	}
	
	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}
	
	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}
	
	//setters
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
	
	
	
}
