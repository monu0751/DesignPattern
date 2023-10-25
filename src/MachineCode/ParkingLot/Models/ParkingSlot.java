package MachineCode.ParkingLot.Models;

import MachineCode.ParkingLot.Models.Constants.ParkingSlotStatus;
import MachineCode.ParkingLot.Models.Constants.VehicleType;

public class ParkingSlot extends BaseModel{
    private int slot_number;
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private Vehicle vehicle;

    public int getSlot_number() {
        return slot_number;
    }

    public void setSlot_number(int slot_number) {
        this.slot_number = slot_number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
