package Lab3;

public class PetManagementSystem {
    public static void main(String[] args) {
        // Dog এবং Cat অবজেক্ট তৈরি করি
        Dog myDog = new Dog("Bruno", 3);
        Cat myCat = new Cat("Kitty", 2);

        // Info দেখাই
        myDog.displayInfo();
        myDog.makeSound(); // Polymorphism: Dog এর Sound

        System.out.println();

        myCat.displayInfo();
        myCat.makeSound(); // Polymorphism: Cat এর Sound

        System.out.println("\n--- Pet Shop, Care, and Service ---\n");

        // Shop থেকে Pet কিনি
        PetShop shop = new PetShop();
        shop.buyPet(myDog);
        shop.buyPet(myCat);

        // Pet Care করি
        PetCare care = new PetCare();
        care.groomPet(myDog);
        care.feedPet(myCat);

        // Pet Service দিই
        PetService service = new PetService();
        service.vetCheckup(myDog);
        service.training(myCat);
    }
}
