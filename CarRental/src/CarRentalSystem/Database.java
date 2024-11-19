package CarRentalSystem;

import java.util.Date;
import java.util.List;

public class Database {
    private List<Customer> customers;
    private List<Vehicle> vehicles;
    private List<Reservation> reservations;
    private List<Payment> payments;
    private List<Maintenance> maintenanceRecords;

    public void addCustomer(Customer customer) {
        // Implementation for adding a customer
    }

    public void addVehicle(Vehicle vehicle) {
        // Implementation for adding a vehicle
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

    public List<Vehicle> searchVehicle(String type, Date date) {
        // Implementation for searching vehicles
        return null;
    }

}
