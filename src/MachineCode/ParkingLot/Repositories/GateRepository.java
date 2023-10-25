package MachineCode.ParkingLot.Repositories;

import MachineCode.ParkingLot.Exceptions.GateNotFoundException;
import MachineCode.ParkingLot.Models.Gate;

import java.util.HashMap;

public class GateRepository {
    private HashMap<Integer, Gate> GateHashMap;

    public GateRepository() {
        this.GateHashMap = new HashMap<>();
    }

    public Gate get(int gateID) throws GateNotFoundException {

        Gate gate = this.GateHashMap.get(gateID);
        if(gate == null)
            throw new GateNotFoundException("No Parking lot found for ID: "+gateID);

        return gate;
    }

    public Gate put(Gate gate) {
        this.GateHashMap.put(gate.getId(),gate);
        return gate;
    }
}
