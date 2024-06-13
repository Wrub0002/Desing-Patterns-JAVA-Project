/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Singleton;


import Base.Car;
import Base.Motorcycle;
import Base.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the VehicleManager class.
 */
public class VehicleManagerTest {

    @Test
    public void testSingletonInstance() {
        // Test that only one instance of VehicleManager exists
        VehicleManager instance1 = VehicleManager.getInstance();
        VehicleManager instance2 = VehicleManager.getInstance();
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testAddAndRetrieveVehicles() {
        // Test adding and retrieving vehicles from VehicleManager
        VehicleManager manager = VehicleManager.getInstance();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        manager.addVehicle(car);
        manager.addVehicle(motorcycle);
        
        assertTrue(manager.getVehicles().contains(car), "VehicleManager should contain the car");
        assertTrue(manager.getVehicles().contains(motorcycle), "VehicleManager should contain the motorcycle");
    }
}
