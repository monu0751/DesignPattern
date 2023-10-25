package DesignPattern.Strategy;

public class Main {

    public static void main(String[] args) {
        VehichleStreategy offRoadDriveVehicleStrategy = VehicleStreategyFactory.
                getVehichleStreategy(VehicleType.OffRoad);

        CarDrive car = new CarDrive();
        car.setVehichleStreategy(offRoadDriveVehicleStrategy);
        car.driveCar();
    }



}
