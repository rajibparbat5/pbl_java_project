package com.servicebooking.service;

import com.servicebooking.model.Booking;
import com.servicebooking.model.Customer;

import java.util.*;

public class BookingService {
    private List<Booking> bookings = new ArrayList<>();

    private static final List<String> services = Arrays.asList(
            "AC Repair", "TV Repair", "Fridge Repair", "Washing Machine Repair", "Microwave Repair"
    );

    private static final Map<String, Double> vendorPrices = new HashMap<>();
    private static final List<String> vendors = Arrays.asList("CoolFix", "ElectroCare", "HomeServe", "QuickFix");

    static {
        vendorPrices.put("CoolFix", 499.0);
        vendorPrices.put("ElectroCare", 599.0);
        vendorPrices.put("HomeServe", 699.0);
        vendorPrices.put("QuickFix", 799.0);
    }

    public void showServices() {
        System.out.println("----- Service List -----");
        for (int i = 0; i < services.size(); i++) {
            System.out.println((i + 1) + ". " + services.get(i));
        }
    }

    public void bookService(Scanner scanner, Customer customer) {
        showServices();
        System.out.print("Select a service by number: ");
        int serviceChoice = Integer.parseInt(scanner.nextLine());
        if (serviceChoice < 1 || serviceChoice > services.size()) {
            System.out.println("Invalid service choice.");
            return;
        }
        String selectedService = services.get(serviceChoice - 1);

        System.out.print("Enter service date (yyyy-mm-dd): ");
        String date = scanner.nextLine();

        System.out.print("Enter slot time (e.g., 10:00 AM - 12:00 PM): ");
        String slot = scanner.nextLine();

        System.out.print("Enter service address: ");
        String address = scanner.nextLine();

        System.out.println("Available vendors:");
        for (int i = 0; i < vendors.size(); i++) {
            System.out.println((i + 1) + ". " + vendors.get(i) + " - ₹" + vendorPrices.get(vendors.get(i)));
        }

        System.out.print("Select a vendor by number: ");
        int vendorChoice = Integer.parseInt(scanner.nextLine());
        if (vendorChoice < 1 || vendorChoice > vendors.size()) {
            System.out.println("Invalid vendor choice.");
            return;
        }

        String selectedVendor = vendors.get(vendorChoice - 1);
        double amount = vendorPrices.get(selectedVendor);

        Booking booking = new Booking(
                customer.getUserId(),
                customer.getUserName(),
                selectedService,
                date,
                slot,
                address,
                selectedVendor,
                amount,
                "Booked"
        );

        bookings.add(booking);
        System.out.println("Booking is successful!");
    }

    public void showBookings(Customer customer) {
        System.out.println("----- Booking History -----");
        boolean found = false;
        for (Booking booking : bookings) {
            if (booking.getUserId().equals(customer.getUserId())) {
                System.out.println(
                        "Customer ID: " + booking.getUserId() +
                        ", Name: " + booking.getUserName() +
                        ", Service: " + booking.getService() +
                        ", Date: " + booking.getDate() +
                        ", Slot: " + booking.getSlot() +
                        ", Vendor: " + booking.getVendor() +
                        ", Amount: ₹" + booking.getAmount() +
                        ", Status: " + booking.getStatus()
                );
                found = true;
            }
        }

        if (!found) {
            System.out.println("No bookings found.");
        }
    }
}
