package MachineCode.ParkingLot.Controllers;

import MachineCode.ParkingLot.DTO.TicketRequestDTO;
import MachineCode.ParkingLot.DTO.TicketResponseDTO;
import MachineCode.ParkingLot.Exceptions.GateNotFoundException;
import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.Ticket;
import MachineCode.ParkingLot.Repositories.*;
import MachineCode.ParkingLot.Services.TicketService;
import MachineCode.ParkingLot.Services.TicketServiceImplementation;

import java.time.LocalDateTime;

public class TicketController {
    private TicketService ticketService;

    public TicketController(ParkingLotRepository parkingLotRepository,
                            GateRepository gateRepository,
                            TicketRepository ticketRepository) {

        this.ticketService = new TicketServiceImplementation(parkingLotRepository,
                ticketRepository,
                gateRepository);

    }

    public TicketResponseDTO createTicket(TicketRequestDTO ticketRequestDTO) throws ParkingLotNotFoundException, GateNotFoundException {
        Ticket ticket = this.ticketService.createTicket(ticketRequestDTO.getVehicle()
                ,ticketRequestDTO.getGate_number(), ticketRequestDTO.getParking_slot_id(), LocalDateTime.now());
        TicketResponseDTO ticketResponseDTO = new TicketResponseDTO();
        ticketResponseDTO.setTicketID(ticket.getId());
        ticketResponseDTO.setEntryTime(ticket.getEntry_time());
        ticketResponseDTO.setSlot_number(ticket.getParkingSlot().getSlot_number());
        return ticketResponseDTO;
    }

}
