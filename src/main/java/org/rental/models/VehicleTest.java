package org.rental.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    void testCarRentalCost() {
        Vehicle car = new Car("123", "Toyota", 100);
        assertEquals(500, car.calculateRentalCost(5));
    }

    @Test
    void testMotorcycleAvailability() {
        Vehicle motorcycle = new Motorcycle("456", "Yamaha", 50);
        assertTrue(motorcycle.isAvailableForRental());
    }
}
