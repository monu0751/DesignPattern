package MachineCode.ParkingLot.Services.Strategies.BillGenerationStategy;

import MachineCode.ParkingLot.Models.Constants.PriceGenerationStrategyType;

public class BillGenerationStrategyFactory {
    public static PriceGenerationStrategy
    getPriceGenerationStrategy(PriceGenerationStrategyType priceGenerationStrategyType){
        switch (priceGenerationStrategyType){
            case lowBillStrategy:
                return new LowBillGenerationStrategy();
            default:
                return null;
        }
    }
}
