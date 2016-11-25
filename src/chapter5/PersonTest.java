package chapter5;

/**
 * This program demonstrates abstract classes.
 * 
 * @version 1.01 2016-09-13.
 * @author Zhang Yufei
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Studetn and Employee objects.
        people[0] = new Employee("Harry Hacker",
                50000, 1989, 10, 1);
        people[1] = new Student("Maria Mirris",
                "computer science");

        // print out names and description of all Person objects.
        for (Person p : people) {
            System.out.println(p.getName() + ", "
                    + p.getDescription());
        }
    }
}
