package Lab1;

public class Hybrid_car implements myinterface.CNG_Car, myinterface.Petrol_Car {
    public void drive(){
        System.out.println("Driving a Hybrid Car");
    }

    @Override
    public void petrol_kit() {
        System.out.println("Using the Petrol kit for Hybrid Car");
    }

    // Overridden method of CNG_Car Interface
    public void cng_kit(){
        System.out.println("Using the CNG kit for Hybrid Car");
    }

}
