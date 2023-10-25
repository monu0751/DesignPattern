package MachineCode.ParkingLot.DTO;

import MachineCode.ParkingLot.Models.Vehicle;

public class TicketRequestDTO {
    public Vehicle vehicle;
    public int Gate_number;

    public int parking_slot_id;

    public int getParking_slot_id() {
        return parking_slot_id;
    }

    public void setParking_slot_id(int parking_slot_id) {
        this.parking_slot_id = parking_slot_id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getGate_number() {
        return Gate_number;
    }

    public void setGate_number(int gate_number) {
        Gate_number = gate_number;
    }
}
