package com.servicebooking.service;

import com.servicebooking.model.Customer;
import com.servicebooking.util.IDGenerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthService {
    private Map<String, Customer> users = new HashMap<>();

    public Customer register(Scanner scanner) {
        System.out.println("Enter User Name (max 50 chars):");
        String userName = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Password (max 30 chars):");
        String password = scanner.nextLine();

        System.out.println("Enter Address (max 100 chars):");
        String address = scanner.nextLine();

        System.out.println("Enter Contact Number (10 digits):");
        String contact = scanner.nextLine();

        String userId = IDGenerator.generateUserId();
        Customer customer = new Customer(userId, userName, email, password, address, contact);
        users.put(userId, customer);

        System.out.println("Customer Registration is successful. Your User ID: " + userId);
        return customer;
    }

    public Customer login(Scanner scanner) {
        System.out.println("Enter User ID:");
        String userId = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        if (users.containsKey(userId) && users.get(userId).getPassword().equals(password)) {
            System.out.println("Customer Login is successful");
            return users.get(userId);
        } else {
            System.out.println("Invalid credentials!");
            return null;
        }
    }

    public Map<String, Customer> getUsers() {
        return users;
    }
}
