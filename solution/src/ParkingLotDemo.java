import model.*;

public class ParkingLotDemo {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 10));

        Vehicle car = new Car("1234", VehicleType.CAR);
        Vehicle bike = new Motorcycle("5678", VehicleType.MOTORCYCLE);
        Vehicle truck = new Truck("ABCD", VehicleType.TRUCK);

        //Park vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        //display availability
        parkingLot.displayAvailability();

        //unpark vehicle
        parkingLot.unparkVehicle(car);

        //display availability
        parkingLot.displayAvailability();

    }
}
