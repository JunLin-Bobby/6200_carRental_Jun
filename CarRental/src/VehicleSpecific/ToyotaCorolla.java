package VehicleSpecific;

import CarRentalSystem.Vehicle;

public class ToyotaCorolla extends Vehicle {

    public ToyotaCorolla() {
        super(2, "Corolla", "Toyota", "Sedan", "DEF-1234", "Available", 60.0f, 18000.0f);
    }

    @Override
    public String toString() {
        return "ToyotaCorolla{" + super.toString() + "}";
    }
}