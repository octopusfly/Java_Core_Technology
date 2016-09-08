package chapter4;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

class Employee {
	private static int nextId = 1;

	private String name;
	private double salary;
	private Date hireDay;
	private int id;

	// static initialization block.
	static {
		Random generator = new Random();
		// set nextIt to a random number between 0 and 9999.
		nextId = generator.nextInt(10000);
	}
	
	// object initialization block.
	{
		id = nextId;
		nextId++;
	}
	
	
	public Employee() {
		// name initialized to ""
		// salary not explicitly set-- initialized to 0.
		// id initialized in initialization block.
	}
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		// GregorianCalendar uses 0 for January
		hireDay = calendar.getTime();
		id = 0;
	}
	
	public Employee(double s) {
		// calls the Employee(String, double) constructor.
		this("Employee #" + nextId, s);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Date getHireDay() {
		return (Date) hireDay.clone();
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId; // set id to next available id.
		nextId++;
	}

	public static int getNextId() {
		return nextId;
	}
	
	public static void main(String[] args) { // unit test.
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
