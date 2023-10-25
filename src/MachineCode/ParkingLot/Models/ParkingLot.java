package MachineCode.ParkingLot.Models;

import MachineCode.ParkingLot.Models.Constants.ParkingLotStatus;
import MachineCode.ParkingLot.Models.Constants.VehicleType;
import MachineCode.ParkingLot.Services.Strategies.BillGenerationStategy.PriceGenerationStrategy;
import MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy.SlotAllocationStrategy;

import java.util.List;

public class ParkingLot extends BaseModel{

    private int parking_lot_number;
    private List<ParkingFloor> parkingFloorList;
    private List<VehicleType> allowedVehicleType;
    private ParkingLotStatus status;
    private SlotAllocationStrategy slotAllocationStrategy;
    private PriceGenerationStrategy priceGenerationStrategy;

    public int getParking_lot_number() {
        return parking_lot_number;
    }

    public void setParking_lot_number(int parking_lot_number) {
        this.parking_lot_number = parking_lot_number;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public List<VehicleType> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(List<VehicleType> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public SlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public PriceGenerationStrategy getPriceGenerationStrategy() {
        return priceGenerationStrategy;
    }

    public void setPriceGenerationStrategy(PriceGenerationStrategy priceGenerationStrategy) {
        this.priceGenerationStrategy = priceGenerationStrategy;
    }
}
