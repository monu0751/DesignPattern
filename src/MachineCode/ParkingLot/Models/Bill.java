package MachineCode.ParkingLot.Models;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private Ticket ticket;
    private LocalDateTime exit_time;
    private double amount;
    private Gate gate;


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public LocalDateTime getExit_time() {
        return exit_time;
    }

    public void setExit_time(LocalDateTime exit_time) {
        this.exit_time = exit_time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }


}
