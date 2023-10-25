package MachineCode.ParkingLot.Exceptions;

public class GateNotFoundException extends Exception {
    public GateNotFoundException() {
    }

    public GateNotFoundException(String message) {
        super(message);
    }
}
