package org.rental.services;

import com.rental.models.Vehicle;
import com.rental.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> fleet;

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void processRental(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.rent(customer, days);
        }
    }
}