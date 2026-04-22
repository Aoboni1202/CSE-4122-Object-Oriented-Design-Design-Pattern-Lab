package Lab3;

// Parent class - Pet
public class Pet {
    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Polymorphic Method
    public void makeSound() {
        System.out.println("Pet is making a sound.");
    }

    public String getName() {
        return name;
    }
}
