package org.rental.models;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public RentalTransaction(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    // Getters and setters
}