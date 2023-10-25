package MachineCode.ParkingLot.Repositories;

import MachineCode.ParkingLot.Exceptions.ParkingFloorNotFoundException;
import MachineCode.ParkingLot.Models.ParkingFloor;

import java.util.HashMap;

public class ParkingFloorRepository {
    private HashMap<Integer, ParkingFloor> ParkingFloorHashMap;

    public ParkingFloorRepository() {
        this.ParkingFloorHashMap = new HashMap<>();
    }

    public ParkingFloor get(int parkingFloorID) throws ParkingFloorNotFoundException {

        ParkingFloor parkingFloor = this.ParkingFloorHashMap.get(parkingFloorID);
        if(parkingFloor == null)
            throw new ParkingFloorNotFoundException("No Parking lot found for ID: "+parkingFloorID);

        return parkingFloor;
    }

    public ParkingFloor put(ParkingFloor parkingFloor) {
        this.ParkingFloorHashMap.put(parkingFloor.getId(),parkingFloor);
        return parkingFloor;
    }
}
