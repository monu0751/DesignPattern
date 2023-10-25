package MachineCode.ParkingLot.Exceptions;

public class ParkingLotNotFoundException extends Exception {
    public ParkingLotNotFoundException() {
    }

    public ParkingLotNotFoundException(String message) {
        super(message);
    }
}
