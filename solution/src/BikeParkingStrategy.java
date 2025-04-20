import model.Vehicle;

public class BikeParkingStrategy implements ParkingStrategy {

    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        System.out.println("Parking Bike using Bike Strategy");
        spot.setParkedVehicle(vehicle);
    }

    public void unparkVehicle(ParkingSpot spot) {
        System.out.println("Unparking Bike using Bike Strategy");
        spot.setParkedVehicle(null);
    }
}
