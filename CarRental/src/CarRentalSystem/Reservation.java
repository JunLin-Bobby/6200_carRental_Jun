package CarRentalSystem;

import java.util.Date;

public class Reservation {
    private int reservationID;
    private int customerID;
    private int vehicleID;
    private Date startDate;
    private Date endDate;
    private float totalCost;
    private String status;

    public void confirm() {
        // Implementation for confirming a reservation
    }

    public void cancel() {
        // Implementation for canceling a reservation
    }

    public float calculateTotalCost() {
        // Implementation for calculating total cost
        return 0.0f;
    }

    // Getters and setters omitted for brevity
}
