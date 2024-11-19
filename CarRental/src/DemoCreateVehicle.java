import CarRentalSystem.Vehicle;
import VehicleSpecific.HondaCRVFactory;
import VehicleSpecific.ToyotaCorollaFactory;

public class DemoCreateVehicle {
    public static void main(String[] args) {
        // Access the singleton factory
        HondaCRVFactory factory = HondaCRVFactory.getInstance();
        ToyotaCorollaFactory toyotaFactory = ToyotaCorollaFactory.getInstance();
        // Get a HondaCRV vehicle
        Vehicle hondaCRV = factory.getObject();
        System.out.println(hondaCRV);

        //Get a Toyota Corolla
        Vehicle toyotaCorolla = toyotaFactory.getObject();
        System.out.println(toyotaCorolla);
    }
}
