import model.Vehicle;

public interface ParkingStrategy {
    void parkVehicle(Vehicle vehicle, ParkingSpot spot);
    void unparkVehicle(ParkingSpot spot);
}
