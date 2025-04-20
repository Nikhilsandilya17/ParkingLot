import model.*;

public class VehicleFactory {
    public Vehicle createVehicle(String licenseNo, VehicleType vehicleType){
        if (vehicleType == VehicleType.CAR) {
            return new Car(licenseNo);
        } else if (vehicleType == VehicleType.MOTORCYCLE) {
            return new Motorcycle(licenseNo);
        } else if (vehicleType == VehicleType.TRUCK) {
            return new Truck(licenseNo);
        } else {
            throw new IllegalArgumentException("Given Vehicle type does not exist");
        }
    }
}
