package CarRentalSystem;

public class Vehicle {
    protected int vehicleID;
    protected String model;
    protected String brand;
    protected String type;
    protected String licensePlate;
    protected String status;
    protected float ratePerDay;
    protected float mileage;

    public Vehicle(int vehicleID, String model, String brand, String type, String licensePlate,
                   String status, float ratePerDay, float mileage) {
        this.vehicleID = vehicleID;
        this.model = model;
        this.brand = brand;
        this.type = type;
        this.licensePlate = licensePlate;
        this.status = status;
        this.ratePerDay = ratePerDay;
        this.mileage = mileage;
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
