package MachineCode.ParkingLot.Services.InIt;

import MachineCode.ParkingLot.Models.Constants.*;
import MachineCode.ParkingLot.Models.Gate;
import MachineCode.ParkingLot.Models.ParkingFloor;
import MachineCode.ParkingLot.Models.ParkingLot;
import MachineCode.ParkingLot.Models.ParkingSlot;
import MachineCode.ParkingLot.Repositories.GateRepository;
import MachineCode.ParkingLot.Repositories.ParkingFloorRepository;
import MachineCode.ParkingLot.Repositories.ParkingLotRepository;
import MachineCode.ParkingLot.Repositories.ParkingSlotRepository;
import MachineCode.ParkingLot.Services.Strategies.BillGenerationStategy.BillGenerationStrategyFactory;
import MachineCode.ParkingLot.Services.Strategies.SlotAllocationStrategy.SlotAllocationStrategyFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InItImplementation implements InIt{
    private ParkingLotRepository parkingLotRepository;
    private ParkingSlotRepository parkingSlotRepository;
    private ParkingFloorRepository parkingFloorRepository;
    private GateRepository gateRepository;

    public InItImplementation(ParkingLotRepository parkingLotRepository,
                              ParkingSlotRepository parkingSlotRepository,
                              ParkingFloorRepository parkingFloorRepository,
                              GateRepository gateRepository) {

        this.parkingLotRepository = parkingLotRepository;
        this.parkingSlotRepository = parkingSlotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.gateRepository = gateRepository;

    }

    @Override
    public void Initialize() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1);
        parkingLot.setParking_lot_number(1);
        parkingLot.setStatus(ParkingLotStatus.open);
        parkingLot.setPriceGenerationStrategy(
                BillGenerationStrategyFactory
                        .getPriceGenerationStrategy(PriceGenerationStrategyType.lowBillStrategy));
        parkingLot.setSlotAllocationStrategy(
                SlotAllocationStrategyFactory
                        .slotAllocationStrategy(SlotAllocationStrategyType.FirstParkingStrategy));
        parkingLot.setAllowedVehicleType(new ArrayList<>(Arrays.asList(
                VehicleType.car,VehicleType.bike
        )));
        List<ParkingFloor> parkingFloorList = new ArrayList<>();
        for(int i=1;i<=10;i++){
           ParkingFloor parkingFloor = new ParkingFloor();
           parkingFloor.setId(i);
           parkingFloor.setFloorNumber(i);
           parkingFloor.setParkingFloorStatus(ParkingFloorStatus.open);

           List<ParkingSlot> parkingSlotList = new ArrayList<>();
           for(int j=1;j<10;j++){
               ParkingSlot parkingSlot = new ParkingSlot();
               parkingSlot.setId(i*100+j);
               parkingSlot.setSlot_number(i*100+j);
               parkingSlot.setParkingSlotStatus(ParkingSlotStatus.free);
               VehicleType allowedVehicle = j%10 < 10*0.10 ? VehicleType.bike:VehicleType.car;
               parkingSlot.setVehicleType(allowedVehicle);
               parkingSlotList.add(parkingSlot);
               parkingSlotRepository.put(parkingSlot);
           }
           parkingFloor.setParkingSlotList(parkingSlotList);
           Gate entryGate = new Gate();
           entryGate.setId(i*10+1);
           entryGate.setGate_number(i*10+1);
           entryGate.setGateStatus(GateStatus.open);
           entryGate.setGateType(GateType.entry);
           entryGate.setParkingFloor(parkingFloor);

           gateRepository.put(entryGate);

            Gate exitGate = new Gate();
            exitGate.setId(i*10+1);
            exitGate.setGate_number(i*10+1);
            exitGate.setGateStatus(GateStatus.open);
            exitGate.setGateType(GateType.entry);
            exitGate.setParkingFloor(parkingFloor);

            gateRepository.put(exitGate);

            parkingFloor.setGateList(new ArrayList<>(Arrays.asList(
                    entryGate,exitGate
            )));

            parkingFloorList.add(parkingFloor);
            parkingFloorRepository.put(parkingFloor);

        }
        parkingLot.setParkingFloorList(parkingFloorList);
        parkingLotRepository.put(parkingLot);
    }
}
