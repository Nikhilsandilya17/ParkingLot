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

        //Out of 100 parking spots, giving 50 to bikes, 40 to cars, 10 to trucks
        double bikeSpots = 0.5;
        double carSpots = 0.4;
        double truckSpots = 0.1;

        int numBikes = (int) (bikeSpots*numSpots);
        int numCars = (int) (numSpots*carSpots);
        int numTrucks = (int) (numSpots*truckSpots);

        for(int i=0;i<numBikes;i++){
            parkingSpots.add(new ParkingSpot(i+1, VehicleType.MOTORCYCLE));

        }
        for(int i=0;i<numCars;i++){
            parkingSpots.add(new ParkingSpot(parkingSpots.size()+1, VehicleType.CAR));

        }
        for(int i=0;i<numTrucks;i++){
            parkingSpots.add(new ParkingSpot(parkingSpots.size()+1, VehicleType.TRUCK));

        }

    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(parkingSpot.isAvailable() && vehicle.getVehicleType()==parkingSpot.getVehicleType()){
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot parkingSpot:parkingSpots){
            if(!parkingSpot.isAvailable() && vehicle.getVehicleType()==parkingSpot.getVehicleType()){
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

