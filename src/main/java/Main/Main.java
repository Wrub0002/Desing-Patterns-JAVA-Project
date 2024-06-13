/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Singleton.VehicleManager;
import Factory.VehicleFactory;
import Builder.CarBuilder;
import Builder.VehicleDirector;
import Builder.VehicleBuilder;
import Base.Vehicle;

/**
 *
 * @author Leonaardo Wrubleski, 041120109 
 * Main class to demonstrate the Singleton, Builder, and Simple Factory patterns.
 */
public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        VehicleManager manager = VehicleManager.getInstance();
        
        // Builder Pattern
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleDirector director = new VehicleDirector();
        Vehicle car = director.constructVehicle(carBuilder);
        car.start();
        car.stop();
        manager.addVehicle(car);

        // Simple Factory Pattern
        VehicleFactory factory = new VehicleFactory();
        Vehicle motorcycle = factory.createVehicle("Motorcycle");
        motorcycle.start();
        motorcycle.stop();
        manager.addVehicle(motorcycle);

        // Show that VehicleManager is a singleton
        VehicleManager anotherManagerInstance = VehicleManager.getInstance();
        System.out.println("VehicleManager instances are the same: " + (manager == anotherManagerInstance));

        // Retrieve vehicles
        for (Vehicle vehicle : manager.getVehicles()) {
            System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
        }
    }
}
