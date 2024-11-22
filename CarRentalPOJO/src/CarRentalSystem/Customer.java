package CarRentalSystem;

public class Customer {
    private int customerID;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String licenseNumber;

    public void register() {
        // Implementation for customer registration
    }

    public void updateProfile() {
        // Implementation for updating customer profile
    }
    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

}