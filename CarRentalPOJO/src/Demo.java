import CarRentalSystem.Database;
import CarRentalSystem.Vehicle;
import VehicleSpecific.HondaCRVFactory;
import VehicleSpecific.ToyotaCorollaFactory;

public class Demo {
    public static void main(String[] args) {
        BuildData();



    }
    public static void BuildData() {
        Database  database = new Database();
        Vehicle Honda1 = HondaCRVFactory.getInstance().getObject();
        Vehicle Honda2 = HondaCRVFactory.getInstance().getObject();
        Vehicle Totoya1 = ToyotaCorollaFactory.getInstance().getObject();
        Vehicle Totoya2 = ToyotaCorollaFactory.getInstance().getObject();
        database.addVehicle(Honda1);
        database.addVehicle(Honda2);
        database.addVehicle(Totoya1);
        database.addVehicle(Totoya2);
        for (Vehicle car : database.getVehicles()){
            System.out.println(car);
        }
    }
}
