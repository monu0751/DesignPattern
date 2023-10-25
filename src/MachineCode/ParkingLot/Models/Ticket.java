package MachineCode.ParkingLot.Models;

import MachineCode.ParkingLot.Models.Constants.TicketStatus;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private LocalDateTime entry_time;
    private TicketStatus ticketStatus;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public LocalDateTime getEntry_time() {
        return entry_time;
    }

    public void setEntry_time(LocalDateTime entry_time) {
        this.entry_time = entry_time;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    private Gate gate;
}
