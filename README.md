
# Service Booking System (Console-Based Java Application)

## 📌 Overview
This is a console-based Java application that allows customers to:
- Register and Login
- View available services
- Book a service by selecting a date, time slot, address, and vendor
- View their booking history

The project is developed using **pure Java** with **in-memory storage**, designed to run in **Eclipse IDE** as a simple, standalone application.

---

## 📁 Project Structure

com.servicebooking
├── main
│   └── MainApp.java           # Main application with menu-driven interface
├── model
│   ├── Customer.java          # Customer details
│   └── Booking.java           # Booking details
├── service
│   ├── AuthService.java       # Registration & login service
│   └── BookingService.java    # Booking and service management
└── util
    └── IDGenerator.java       # Generates random user IDs



---

## ✅ Features

### US001 - Customer Registration
- Input user details from console
- Auto-generate unique 7-digit user ID
- Displays confirmation on success

### US002 - Customer Login
- Accepts User ID and Password
- Validates credentials
- Displays acknowledgment message

### US003 - Menu
- Displays post-login menu
- Options to:
  - View services
  - Book a service
  - View booking history
  - Logout

### US004 - Service List
- Shows list of available services (e.g., AC Repair, TV Repair, etc.)

### US005 - Service Booking
- Lets users:
  - Select service
  - Enter booking date and time slot
  - Choose a vendor
  - See fixed amount per vendor
- Booking acknowledgment is displayed

### US006 - Booking History
- Displays all previous bookings by the logged-in user
- Columns: `UserID`, `UserName`, `Service`, `Date`, `Slot`, `Vendor`, `Amount`, `Status`

---

## 🧩 Sample Data
- **Services:** AC Repair, TV Repair, Fridge Repair, etc.
- **Vendors:** CoolFix, ElectroCare, HomeServe, QuickFix
- **Vendor Charges:** ₹499 – ₹799 depending on vendor

---

## 🚀 Future Enhancements
- File or database-based persistence
- Admin module for managing services/vendors
- GUI interface using Swing or JavaFX
- Email/SMS confirmation on booking

---

## 🛠 Technologies Used
- Java SE 8+
- Eclipse IDE
- Java Collections for in-memory data management

---





