package MachineCode.ParkingLot.Services;

import MachineCode.ParkingLot.Exceptions.GateNotFoundException;
import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.Ticket;
import MachineCode.ParkingLot.Models.Vehicle;

import java.time.LocalDateTime;

public interface TicketService {
    public Ticket createTicket(Vehicle vehicle, int gate_number, int parking_lot_id, LocalDateTime entryTime) throws GateNotFoundException, ParkingLotNotFoundException;
}
