
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;

import Base.Car;
import Base.Vehicle;

/**
 * Concrete builder for constructing a car.
 */
public class CarBuilder implements VehicleBuilder {
    private final Vehicle car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public void buildEngine() {
        car.setEngine("Car Engine");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }
}
