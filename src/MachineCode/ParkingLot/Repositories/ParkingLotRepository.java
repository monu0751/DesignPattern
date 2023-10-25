package MachineCode.ParkingLot.Repositories;

import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.ParkingLot;

import java.util.HashMap;

public class ParkingLotRepository {
    private HashMap<Integer, ParkingLot> parkingLotHashMap;

    public ParkingLotRepository() {
        this.parkingLotHashMap = new HashMap<>();
    }

    public ParkingLot get(int parkingLotID) throws ParkingLotNotFoundException {

        ParkingLot parkingLot = this.parkingLotHashMap.get(parkingLotID);
        if(parkingLot == null)
            throw new ParkingLotNotFoundException("No Parking lot found for ID: "+parkingLotID);

        return parkingLot;
    }

    public ParkingLot put(ParkingLot parkingLot) {
        this.parkingLotHashMap.put(parkingLot.getId(),parkingLot);
        return parkingLot;
    }
}
