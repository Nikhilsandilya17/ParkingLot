package model;

public class Car extends Vehicle{

    public Car(String licenseNo) {
        super(licenseNo);
        setVehicleType(VehicleType.CAR); // set it inside constructor
    }

}
