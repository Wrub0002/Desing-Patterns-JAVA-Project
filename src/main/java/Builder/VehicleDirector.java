/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import Base.Vehicle;

/**
 * Director class to construct a vehicle using a VehicleBuilder.
 */
public class VehicleDirector {
    /**
     * Constructs a vehicle using the provided builder.
     * @param builder the vehicle builder
     * @return the constructed vehicle
     */
    public Vehicle constructVehicle(VehicleBuilder builder) {
        builder.buildEngine();
        builder.buildWheels();
        return builder.getVehicle();
    }
}
