package Factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import Base.Car;
import Base.Motorcycle;
import Base.Vehicle;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Tests for VehicleFactory, validating the Simple Factory pattern.
 */
public class VehicleFactoryTest {
    /**
     * Verifies that a Car instance is created when "Car" is specified.
     */
    @Test
    public void testCreateCar() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("Car");
        assertTrue(vehicle instanceof Car, "Expected a Car instance.");
    }
    /**
     * Verifies that a Motorcycle instance is created when "Motorcycle" is specified.
     */
    @Test
    public void testCreateMotorcycle() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("Motorcycle");
        assertTrue(vehicle instanceof Motorcycle, "Expected a Motorcycle instance.");
    }
    /**
     * Ensures the factory returns null when an unrecognized type is requested.
     */
    @Test
    public void testCreateInvalidType() {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle = factory.createVehicle("Bus");
        assertNull(vehicle, "Expected null for unrecognized vehicle type.");
    }
}
