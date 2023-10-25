package MachineCode.ParkingLot.Models;

import MachineCode.ParkingLot.Models.Constants.GateStatus;
import MachineCode.ParkingLot.Models.Constants.GateType;

public class Gate extends BaseModel{
    int gate_number;
    String Operator;
    GateType gateType;
    ParkingFloor parkingFloor;
    GateStatus gateStatus;

    public int getGate_number() {
        return gate_number;
    }

    public void setGate_number(int gate_number) {
        this.gate_number = gate_number;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
