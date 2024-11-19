package CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public  class Database {
    private ArrayList<Customer> customers;
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Reservation> reservations;
    private ArrayList<Payment> payments;

    public Database( ) {
        this.customers = new ArrayList<>();
        this.vehicles =  new ArrayList<>();
        this.reservations =  new ArrayList<>();
        this.payments =  new ArrayList<>();
        this.maintenanceRecords = new ArrayList<>();
    }

    private ArrayList<Maintenance> maintenanceRecords;

    public void addCustomer(Customer customer) {
        // Implementation for adding a customer
    }

    public void addVehicle(Vehicle vehicle) {
        // Implementation for adding a vehicle
        vehicles.add(vehicle);
    }

    public void addReservation(Reservation reservation) {
        // Implementation for adding a reservation
    }

    public void addPayment(Payment payment) {
        // Implementation for adding a payment
    }

    public boolean getVehicleAvailability(int vehicleID, Date date) {
        // Implementation for checking vehicle availability
        return false;
    }

    public ArrayList<Vehicle> searchVehicle(String type, Date date) {
        // Implementation for searching vehicles
        return null;
    }
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

}
