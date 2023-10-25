package DesignPattern.Strategy;

public class VehicleStreategyFactory {
    public static VehichleStreategy getVehichleStreategy(VehicleType vehicleType){
        switch(vehicleType){
            case OnRoad:
                return new OnRoadDrive();
            case OffRoad:
                return new OffRoadDrive();
            default:
                return null;
        }
    }
}
