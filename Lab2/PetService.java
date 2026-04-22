package Lab3;

public class PetService {

    public void vetCheckup(Pet pet) {
        System.out.println(pet.getName() + " is visiting the vet!");
    }

    public void training(Pet pet) {
        System.out.println(pet.getName() + " is receiving training!");
    }
}
