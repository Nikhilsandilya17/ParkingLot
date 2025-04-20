package model;

public class Truck extends Vehicle{

    public Truck(String licenseNo) {
        super(licenseNo);
        setVehicleType(VehicleType.TRUCK); // set it inside constructor
    }
}
