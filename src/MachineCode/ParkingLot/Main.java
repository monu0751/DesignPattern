package MachineCode.ParkingLot;

import MachineCode.ParkingLot.Controllers.TicketController;
import MachineCode.ParkingLot.DTO.TicketRequestDTO;
import MachineCode.ParkingLot.DTO.TicketResponseDTO;
import MachineCode.ParkingLot.Exceptions.GateNotFoundException;
import MachineCode.ParkingLot.Exceptions.ParkingLotNotFoundException;
import MachineCode.ParkingLot.Models.Constants.VehicleType;
import MachineCode.ParkingLot.Models.ParkingLot;
import MachineCode.ParkingLot.Models.Vehicle;
import MachineCode.ParkingLot.Repositories.*;
import MachineCode.ParkingLot.Services.InIt.InIt;
import MachineCode.ParkingLot.Services.InIt.InItImplementation;

public class Main {
    public static void main(String[] args) throws ParkingLotNotFoundException, GateNotFoundException {
        GateRepository gateRepository = new GateRepository();
        ParkingSlotRepository parkingSlotRepository = new ParkingSlotRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        TicketRepository ticketRepository = new TicketRepository();

        InIt init = new InItImplementation(
                        parkingLotRepository
                        ,parkingSlotRepository
                        ,parkingFloorRepository
                        ,gateRepository);
        init.Initialize();

        ParkingLot parkingLot = parkingLotRepository.get(1);
        TicketRequestDTO ticketRequestDTO = new TicketRequestDTO();
        ticketRequestDTO.setGate_number(21);
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleType(VehicleType.car);
        vehicle.setId(1);
        vehicle.setColor("green");
        vehicle.setName("Abhinav");
        vehicle.setModel("Baleno");
        vehicle.setRegistration_number("MP074799");

        ticketRequestDTO.setVehicle(vehicle);
        ticketRequestDTO.setParking_slot_id(parkingLot.getId());

        TicketController ticketController =
                new TicketController(parkingLotRepository,gateRepository,ticketRepository);
        TicketResponseDTO ticketResponseDTO = ticketController.createTicket(ticketRequestDTO);
        System.out.println(ticketResponseDTO.toString());

    }
}
