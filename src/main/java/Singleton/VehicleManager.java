/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Singleton;

/**
 * Singleton class to manage all vehicles in the system.
 * Ensures that only one instance of VehicleManager exists.
 */
import Base.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    // Static variable to hold the single instance of VehicleManager
    private static VehicleManager instance;
    // List to store the vehicles
    private List<Vehicle> vehicles;

    // Private constructor to prevent instantiation from other classes
    private VehicleManager() {
        vehicles = new ArrayList<>();
    }
    
     /**
     * Public method to provide access to the single instance of VehicleManager.
     * @return the single instance of VehicleManager
     */
    public static VehicleManager getInstance() {
        if (instance == null) {
            instance = new VehicleManager();
        }
        return instance;
    }
    /**
     * Adds a vehicle to the vehicle manager.
     * @param vehicle the vehicle to add
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    /**
     * Retrieves the list of vehicles managed by the vehicle manager.
     * @return the list of vehicles
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
