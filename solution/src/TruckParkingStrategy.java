import model.Vehicle;

public class TruckParkingStrategy implements ParkingStrategy{
    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        System.out.println("Parking Truck using Truck Strategy");
        spot.setParkedVehicle(vehicle);
    }

    public void unparkVehicle(ParkingSpot spot) {
        System.out.println("Unparking Truck using Truck Strategy");
        spot.setParkedVehicle(null);
    }
}
