package MachineCode.ParkingLot.Models;

import MachineCode.ParkingLot.Models.Constants.ParkingFloorStatus;
import MachineCode.ParkingLot.Models.Constants.ParkingSlotStatus;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNumber;
    private List<ParkingSlot> parkingSlotList;
    private ParkingFloorStatus parkingFloorStatus;
    private List<Gate> gateList;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<Gate> getGateList() {
        return gateList;
    }

    public void setGateList(List<Gate> gateList) {
        this.gateList = gateList;
    }
}
