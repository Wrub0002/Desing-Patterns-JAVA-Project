/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import Base.Vehicle;

/**
 * Interface for building different parts of a vehicle.
 */
public interface VehicleBuilder {
    /**
     * Builds the engine of the vehicle.
     */
    void buildEngine();
    /**
     * Builds the wheels of the vehicle.
     */
    void buildWheels();
    /**
     * Gets the constructed vehicle.
     * @return the constructed vehicle
     */
    Vehicle getVehicle();
}
