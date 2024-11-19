package CarRentalSystem;

import java.util.Date;

public class Payment {
    private int paymentID;
    private int reservationID;
    private float amount;
    private Date paymentDate;
    private String paymentMethod;

    public boolean processPayment() {
        // Implementation for processing payment
        return true;
    }

    // Getters and setters omitted for brevity
}