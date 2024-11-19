package VehicleSpecific;

import CarRentalSystem.Vehicle;

public class HondaCRV extends Vehicle {

    public HondaCRV() {
        super(1, "CRV", "Honda", "SUV", "XYZ-9876", "Available", 75.5f, 20000.0f);
    }

    @Override
    public String toString() {
        return "CarRentalSystem.Vehicle{" +
                "vehicleID=" + vehicleID +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", status='" + status + '\'' +
                ", ratePerDay=" + ratePerDay +
                ", mileage=" + mileage +
                '}';
    }
}
