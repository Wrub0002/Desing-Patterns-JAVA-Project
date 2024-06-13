/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import Base.Car;
import Base.Motorcycle;
import Base.Vehicle;

/**
 * Factory class to create instances of vehicles based on user input.
 */
public class VehicleFactory {
    /**
     * Creates a vehicle instance based on the provided type.
     * @param type the type of vehicle
     * @return the created vehicle instance
     */
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            return new Motorcycle();
        }
        return null;
    }
}