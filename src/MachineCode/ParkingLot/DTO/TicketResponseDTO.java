package MachineCode.ParkingLot.DTO;

import java.time.LocalDateTime;

public class TicketResponseDTO {
    public int TicketID;
    public LocalDateTime entryTime;
    public int slot_number;

    public int getTicketID() {
        return TicketID;
    }

    @Override
    public String toString() {
        return "TicketResponseDTO{" +
                "TicketID=" + TicketID +
                ", entryTime=" + entryTime +
                ", slot_number=" + slot_number +
                '}';
    }

    public void setTicketID(int ticketID) {
        TicketID = ticketID;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public int getSlot_number() {
        return slot_number;
    }

    public void setSlot_number(int slot_number) {
        this.slot_number = slot_number;
    }


}
