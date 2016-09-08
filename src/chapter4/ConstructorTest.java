package chapter4;

/**
 * This program demonstrates object construction.
 * @version 1.01 2016-09-08.
 * @author Zhang Yufei
 */
public class ConstructorTest {
	public static void main(String[] args) {
		// fill the staff array with three Empolyee objects.
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		// print out information about all Employee objects.
		for(Employee e : staff) {
			System.out.println("name = " + e.getName() 
				+ " id = " + e.getId() + " salary = " + e.getSalary());
		}
	}
}
