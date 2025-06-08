package com.servicebooking.model;

public class Booking {
    private String userId;
    private String userName;
    private String service;
    private String date;
    private String slot;
    private String address;
    private String vendor;
    private double amount;
    private String status;

    public Booking(String userId, String userName, String service, String date, String slot,
                   String address, String vendor, double amount, String status) {
        this.userId = userId;
        this.userName = userName;
        this.service = service;
        this.date = date;
        this.slot = slot;
        this.address = address;
        this.vendor = vendor;
        this.amount = amount;
        this.status = status;
    }

    public String getUserId() { return userId; }
    public String getUserName() { return userName; }
    public String getService() { return service; }
    public String getDate() { return date; }
    public String getSlot() { return slot; }
    public String getAddress() { return address; }
    public String getVendor() { return vendor; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }
}
