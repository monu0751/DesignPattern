package MachineCode.ParkingLot.Repositories;

import MachineCode.ParkingLot.Exceptions.TicketNotFoundException;
import MachineCode.ParkingLot.Models.Ticket;

import java.util.HashMap;

public class TicketRepository {
    private HashMap<Integer, Ticket> TicketHashMap;

    public TicketRepository() {
        this.TicketHashMap = new HashMap<>();
    }

    public Ticket get(int ticketID) throws TicketNotFoundException {

        Ticket ticket = this.TicketHashMap.get(ticketID);
        if(ticket == null)
            throw new TicketNotFoundException("No Parking lot found for ID: "+ticketID);

        return ticket;
    }

    public Ticket put(Ticket ticket) {
        this.TicketHashMap.put(ticket.getId(),ticket);
        return ticket;
    }
}
