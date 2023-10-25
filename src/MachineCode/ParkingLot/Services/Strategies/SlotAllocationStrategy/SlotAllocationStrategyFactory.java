package MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy;

import MachineCode.ParkingLot.Models.Constants.SlotAllocationStrategyType;

public class SlotAllocationStrategyFactory {
    public static SlotAllocationStrategy slotAllocationStrategy(SlotAllocationStrategyType slotAllocationStrategyType){
        switch (slotAllocationStrategyType){
            case FirstParkingStrategy:
                return new FirstParkingSlotStrategy();
            default:
                return null;
        }
    }
}
