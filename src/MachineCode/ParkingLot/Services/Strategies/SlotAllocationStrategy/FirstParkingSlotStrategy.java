package MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy;

import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.*;
import MachineCode.ParkingLot.Models.Constants.ParkingSlotStatus;
import MachineCode.ParkingLot.Repositories.GateRepository;
import MachineCode.ParkingLot.Repositories.ParkingLotRepository;
import MachineCode.ParkingLot.Repositories.ParkingSlotRepository;

public class FirstParkingSlotStrategy implements SlotAllocationStrategy{

    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private GateRepository gateRepository;

    @Override
    public ParkingSlot getParkingSlot(Vehicle vehicle, Gate gate, ParkingLot parkingLot) throws ParkingLotNotFoundException {

        int floor_number = gate.getParkingFloor().getFloorNumber();

        for(ParkingSlot parkingSlot : parkingLot.getParkingFloorList().get(floor_number).getParkingSlotList()){

            if(parkingSlot.getParkingSlotStatus().equals(ParkingSlotStatus.free) && parkingSlot.getVehicleType().equals(vehicle.getVehicleType())){
                return parkingSlot;
            }

        }
        throw new ParkingLotNotFoundException("No parking slot available");
    }
}
