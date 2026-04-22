package Lab3;

// Child class - Dog
public class Dog extends Pet{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}
