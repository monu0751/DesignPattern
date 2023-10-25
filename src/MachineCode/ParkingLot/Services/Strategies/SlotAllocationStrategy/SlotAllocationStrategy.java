package MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy;

import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.Gate;
import MachineCode.ParkingLot.Models.ParkingLot;
import MachineCode.ParkingLot.Models.ParkingSlot;
import MachineCode.ParkingLot.Models.Vehicle;

public interface SlotAllocationStrategy {
    public ParkingSlot getParkingSlot(Vehicle vehicle, Gate gate, ParkingLot parkingLot) throws ParkingLotNotFoundException;
}
