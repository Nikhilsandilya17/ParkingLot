import model.*;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 10));

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.createVehicle("1234", VehicleType.CAR);
        Vehicle bike = vehicleFactory.createVehicle("5678", VehicleType.MOTORCYCLE);
        Vehicle truck = vehicleFactory.createVehicle("ABCD", VehicleType.TRUCK);

        //Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        //display availability
        parkingLot.displayAvailability();

        //unparkVehicle vehicle
        parkingLot.unparkVehicle(car);

        //display availability
        parkingLot.displayAvailability();

    }
}
