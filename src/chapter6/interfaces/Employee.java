package chapter6.interfaces;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable<Employee>, Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        hireDay = new Date();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();
        
        // clone mutable fields.
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }
    
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     * 
     * @param other
     *            another Employee object
     * @return a negative value if this employee has a lower salary than
     *         otherObject, 0 if salaries are same, a positive value otherwise.
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    /**
     * Set the hire day to a given date.
     * 
     * @param year
     *            the year of the hire day.
     * @param month
     *            the month of the hire day.
     * @param day
     *            the day of the hire day.
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        // Example of instance field mutation.
        hireDay.setTime(newHireDay.getTime());
    }

    public String toString() {
        return "Employee[name=" + name + ", salary=" + salary + ", hireday=" + hireDay + "]";
    }
}
