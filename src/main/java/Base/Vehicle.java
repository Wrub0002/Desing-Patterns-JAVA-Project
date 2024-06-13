package Base;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * Abstract class representing a vehicle.
 */
public abstract class Vehicle {
    private String engine;
    private int wheels;
    /**
     * Gets the engine of the vehicle.
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }
    /**
     * Sets the engine of the vehicle.
     * @param engine the engine to set
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    /**
     * Gets the number of wheels of the vehicle.
     * @return the number of wheels
     */
    public int getWheels() {
        return wheels;
    }
    /**
     * Sets the number of wheels of the vehicle.
     * @param wheels the number of wheels to set
     */
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    /**
     * Starts the vehicle.
     */
    public abstract void start();
    /**
     * Stops the vehicle.
     */
    public abstract void stop();
}
