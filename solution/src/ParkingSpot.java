import model.Vehicle;
import model.VehicleType;

public class ParkingSpot {
    private Vehicle parkedVehicle;
    private final VehicleType vehicleType;
    private final int spotNumber;
    private final ParkingStrategy parkingStrategy;

    public ParkingSpot(int spotNumber, VehicleType vehicleType, ParkingStrategy strategy) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
        this.parkingStrategy = strategy;
    }

    public boolean isAvailable() {
        return parkedVehicle == null;
    }


    public void parkVehicle(Vehicle vehicle) {
        parkingStrategy.parkVehicle(vehicle, this);
    }

    public void unparkVehicle() {
        parkingStrategy.unparkVehicle(this);
    }

    public void displayAvailability() {
        if (isAvailable()) {
            System.out.println("Parking spot with spot number: " + spotNumber + " available for Vehicle type: " + vehicleType);
        } else {
            System.out.println("Parking spot with spot number: " + spotNumber + " occupied by Vehicle type: " + vehicleType);
        }
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle vehicle) {
        this.parkedVehicle = vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
