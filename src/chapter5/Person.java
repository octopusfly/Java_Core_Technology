package chapter5;

public abstract class Person {
    private String name;
    public abstract String getDescription();
    
    public Person(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }
}
