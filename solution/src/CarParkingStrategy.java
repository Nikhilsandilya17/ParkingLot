import model.Vehicle;

public class CarParkingStrategy implements ParkingStrategy{
    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        System.out.println("Parking Car using Car Strategy");
        spot.setParkedVehicle(vehicle);
    }

    public void unparkVehicle(ParkingSpot spot) {
        System.out.println("Unparking Car using Car Strategy");
        spot.setParkedVehicle(null);
    }
}
