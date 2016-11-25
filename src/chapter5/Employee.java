package chapter5;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee extends Person {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        super(n);
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public boolean equals(Object otherObject) {
        // a quack test to see if the objects are identical.
        if (this == otherObject) {
            return true;
        }

        // must return false if the explicit parameter is null.
        if (otherObject == null) {
            return false;
        }

        // if the classes doesn't match, they can't be equal.
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // now we know otherObject is a non-null Employee.
        Employee other = (Employee) otherObject;

        // test whether the fields ahve identical values.
        return Objects.equals(name, other.name) && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name = " + name + ", salary = " + salary + ", hireDay = "
                + hireDay + "]";
    }
}
