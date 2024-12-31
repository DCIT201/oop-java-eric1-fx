package org.rental.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String contactInfo;
    private List<RentalTransaction> rentalHistory;

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.rentalHistory = new ArrayList<>();
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}