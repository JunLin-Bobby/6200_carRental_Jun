package CarRentalSystem;

import java.sql.Date;

public class Reservation {
    private int reservationID;
    private int customerID;
    private int vehicleID;
    private Date startDate;
    private Date endDate;
    private float totalCost;
    private String status;

    // Constructor with parameters
    public Reservation(int customerID, int vehicleID, Date startDate, Date endDate, float totalCost, String status) {
        this.customerID = customerID;
        this.vehicleID = vehicleID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
        this.status = status;
    }

    // Getters and setters
    public int getCustomerID() {
        return customerID;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationID=" + reservationID +
                ", customerID=" + customerID +
                ", vehicleID=" + vehicleID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalCost=" + totalCost +
                ", status='" + status + '\'' +
                '}';
    }
}
