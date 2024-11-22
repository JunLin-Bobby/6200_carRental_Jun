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
    public int getPaymentID() {
        return paymentID;
    }

    public int getReservationID() {
        return reservationID;
    }

    public float getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    // Getters and setters omitted for brevity
}