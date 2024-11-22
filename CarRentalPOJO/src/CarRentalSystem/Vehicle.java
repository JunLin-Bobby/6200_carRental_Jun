package CarRentalSystem;

public abstract class Vehicle {
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
    public int getVehicleID() {
        return vehicleID;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getStatus() {
        return status;
    }

    public float getRatePerDay() {
        return ratePerDay;
    }

    public float getMileage() {
        return mileage;
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
