package MachineCode.ParkingLot.Exceptions;

public class TicketNotFoundException extends Exception {
    public TicketNotFoundException() {
    }

    public TicketNotFoundException(String message) {
        super(message);
    }
}
