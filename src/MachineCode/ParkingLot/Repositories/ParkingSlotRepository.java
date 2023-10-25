package MachineCode.ParkingLot.Repositories;

import MachineCode.ParkingLot.Models.ParkingSlot;
import MachineCode.ParkingLot.Exceptions.ParkingSlotNotFoundException;
import MachineCode.ParkingLot.Models.ParkingSlot;

import java.util.HashMap;

public class ParkingSlotRepository {
    private HashMap<Integer, ParkingSlot> ParkingSlotHashMap;

    public ParkingSlotRepository() {
        this.ParkingSlotHashMap = new HashMap<>();
    }

    public ParkingSlot get(int parkingSlotID) throws ParkingSlotNotFoundException {

        ParkingSlot parkingSlot = this.ParkingSlotHashMap.get(parkingSlotID);
        if(parkingSlot == null)
            throw new ParkingSlotNotFoundException("No Parking lot found for ID: "+parkingSlotID);

        return parkingSlot;
    }

    public ParkingSlot put(ParkingSlot parkingSlot) {
        this.ParkingSlotHashMap.put(parkingSlot.getId(),parkingSlot);
        return parkingSlot;
    }
}
