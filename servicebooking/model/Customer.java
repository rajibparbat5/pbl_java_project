package com.servicebooking.model;

public class Customer {
    private String userId;
    private String userName;
    private String email;
    private String password;
    private String address;
    private String contactNumber;

    public Customer(String userId, String userName, String email, String password, String address, String contactNumber) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getUserId() { return userId; }
    public String getUserName() { return userName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getAddress() { return address; }
    public String getContactNumber() { return contactNumber; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setAddress(String address) { this.address = address; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}
