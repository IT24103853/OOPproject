package BookingManagement.BookingManagement;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int userId;
    private int serviceId;
    private String customerName; // For file storage
    private LocalDate bookingDate;
    private String status;

    // Constructor for database
    public Booking(int bookingId, int userId, int serviceId, LocalDate bookingDate, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.serviceId = serviceId;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    // Constructor for file storage
    public Booking(int bookingId, String customerName, LocalDate bookingDate, String status) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}