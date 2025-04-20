package model;

public class Motorcycle extends Vehicle{

    public Motorcycle(String licenseNo) {
        super(licenseNo);
        setVehicleType(VehicleType.MOTORCYCLE); // set it inside constructor

    }
}
