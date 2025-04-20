import model.Vehicle;
import model.VehicleType;

public class ParkingSpot {
    private Vehicle parkedVehicle;
    private VehicleType vehicleType;
    private int spotNumber;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable(){
        return parkedVehicle == null;
    }

    public void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getVehicleType()==vehicleType){
            parkedVehicle = vehicle;
        }
        else {
            throw new IllegalArgumentException("Invalid Vehicle type or Spot already occupied");
        }
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void unparkVehicle() {
        parkedVehicle = null;
    }

    public void displayAvailability() {
        if(isAvailable()){
            System.out.println("Parking spot with spot number: " + spotNumber+ " available for Vehicle type: " + vehicleType);
        }
        else {
            System.out.println("Parking spot with spot number: " + spotNumber+ " occupied by Vehicle type: "+ vehicleType);
        }
    }
}
