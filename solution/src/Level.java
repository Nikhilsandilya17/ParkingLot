import model.Vehicle;
import model.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final List<ParkingSpot> parkingSpots;
    private final int floor;

    public Level(int floor, int numSpots) {
        this.parkingSpots = new ArrayList<>();
        this.floor = floor;

        int numBikes = (int) (0.5 * numSpots);
        int numCars = (int) (0.4 * numSpots);
        int numTrucks = (int) (0.1 * numSpots);

        for (int i = 0; i < numBikes; i++) {
            parkingSpots.add(new ParkingSpot(i + 1, VehicleType.MOTORCYCLE, new BikeParkingStrategy()));
        }
        for (int i = 0; i < numCars; i++) {
            parkingSpots.add(new ParkingSpot(parkingSpots.size() + 1, VehicleType.CAR, new CarParkingStrategy()));
        }
        for (int i = 0; i < numTrucks; i++) {
            parkingSpots.add(new ParkingSpot(parkingSpots.size() + 1, VehicleType.TRUCK, new TruckParkingStrategy()));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isAvailable() && parkingSpot.getVehicleType()==vehicle.getVehicleType()) {
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (!parkingSpot.isAvailable() && parkingSpot.getParkedVehicle().equals(vehicle)) {
                parkingSpot.unparkVehicle();
                return true;
            }
        }
        return false;
    }


    public void displayAvailability(){
        for(ParkingSpot parkingSpot: parkingSpots){
            parkingSpot.displayAvailability();
        }
    }




}

