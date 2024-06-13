/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Builder;

import Base.Car;
import Base.Vehicle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the VehicleDirector class.
 */
public class VehicleDirectorTest {

    /**
     * Test of constructVehicle method, of class VehicleDirector.
     */
    @Test
    public void testConstructVehicle() {
        System.out.println("constructVehicle");

        // Use a concrete implementation of VehicleBuilder
        VehicleBuilder builder = new CarBuilder(); 
        VehicleDirector instance = new VehicleDirector();

        // Construct the vehicle using the director
        Vehicle result = instance.constructVehicle(builder);

        // Validate the constructed vehicle
        assertNotNull(result, "The constructed vehicle should not be null.");
        assertTrue(result instanceof Car, "The constructed vehicle should be an instance of Car.");
        assertEquals("Car Engine", result.getEngine(), "The engine of the car should be 'Car Engine'.");
        assertEquals(4, result.getWheels(), "The car should have 4 wheels.");
    }
}
