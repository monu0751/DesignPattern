package MachineCode.ParkingLot.Services;

import MachineCode.ParkingLot.Exceptions.GateNotFoundException;
import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.*;
import MachineCode.ParkingLot.Models.Constants.SlotAllocationStrategyType;
import MachineCode.ParkingLot.Models.Constants.TicketStatus;
import MachineCode.ParkingLot.Repositories.*;
import MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy.SlotAllocationStrategyFactory;

import java.time.LocalDateTime;

public class TicketServiceImplementation implements TicketService{
    private ParkingLotRepository parkingLotRepository;
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;

    public TicketServiceImplementation(ParkingLotRepository parkingLotRepository,
                              TicketRepository ticketRepository,
                              GateRepository gateRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.gateRepository = gateRepository;

    }
    @Override
    public Ticket createTicket(Vehicle vehicle,
                               int gate_id,
                               int parking_lot_id,
                               LocalDateTime entryTime) throws GateNotFoundException, ParkingLotNotFoundException {

        Ticket ticket = new Ticket();
        ticket.setTicketStatus(TicketStatus.open);
        ticket.setVehicle(vehicle);
        Gate entryGate = this.gateRepository.get(gate_id);
        ParkingLot parkingLot = this.parkingLotRepository.get(parking_lot_id);
        ParkingSlot parkingSlot = SlotAllocationStrategyFactory
                .slotAllocationStrategy(SlotAllocationStrategyType.FirstParkingStrategy)
                .getParkingSlot(vehicle,entryGate,parkingLot);

        ticket.setParkingSlot(parkingSlot);
        ticket.setEntry_time(entryTime);

        return this.ticketRepository.put(ticket);
    }
}
