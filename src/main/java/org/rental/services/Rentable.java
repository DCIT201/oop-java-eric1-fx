package org.rental.services;

import org.rental.models.Customer;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}