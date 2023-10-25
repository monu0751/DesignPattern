package MachineCode.ParkingLot.Services.Strategies.BillGenerationStategy;

public class LowBillGenerationStrategy implements PriceGenerationStrategy{
    @Override
    public double getLowPriceStrategy() {
        return 50;
    }
}
