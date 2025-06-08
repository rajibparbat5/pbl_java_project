package com.servicebooking.main;

import com.servicebooking.model.Booking;
import com.servicebooking.model.Customer;
import com.servicebooking.service.AuthService;
import com.servicebooking.service.BookingService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService authService = new AuthService();
        BookingService bookingService = new BookingService();

        Customer loggedInUser = null;
        boolean running = true;

        while (running) {
            if (loggedInUser == null) {
                System.out.println("\n1. Register\n2. Login\n3. Exit");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: loggedInUser = authService.register(scanner); break;
                    case 2: loggedInUser = authService.login(scanner); break;
                    case 3: running = false; break;
                    default: System.out.println("Invalid Option");
                }
            } else {
                System.out.println("\n1. Services List\n2. Book Service\n3. Booking History\n4. Logout");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1: bookingService.showServices(); break;
                    case 2: bookingService.bookService(scanner, loggedInUser); break;
                    case 3: bookingService.showBookings(loggedInUser); break;
                    case 4: loggedInUser = null; break;
                    default: System.out.println("Invalid Option");
                }
            }
        }

        scanner.close();
    }
}
