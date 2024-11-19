import CarRentalSystem.Database;
import CarRentalSystem.Vehicle;
import VehicleSpecific.HondaCRVFactory;
import VehicleSpecific.ToyotaCorollaFactory;

public class DemoCreateVehicle {
    public static void main(String[] args) {
        // Access the singleton factory

        Database database = new Database();
        HondaCRVFactory factory = HondaCRVFactory.getInstance();
        ToyotaCorollaFactory toyotaFactory = ToyotaCorollaFactory.getInstance();

        database.addVehicle(HondaCRVFactory.getInstance().getObject());
        database.addVehicle(ToyotaCorollaFactory.getInstance().getObject());
        for(Vehicle car : database.getVehicles()){
            System.out.println(car);
        }

//        // Get a HondaCRV vehicle
//        Vehicle hondaCRV = factory.getObject();
//        System.out.println(hondaCRV);
//
//        //Get a Toyota Corolla
//        Vehicle toyotaCorolla = toyotaFactory.getObject();
//        System.out.println(toyotaCorolla);
    }
}
