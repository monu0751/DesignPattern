package DesignPattern.Strategy;

public class CarDrive {

    private VehichleStreategy vehichleStreategy;

    public void setVehichleStreategy(VehichleStreategy vehichleStreategy) {
        this.vehichleStreategy = vehichleStreategy;
    }

    public void driveCar(){
        vehichleStreategy.drive();
    }
}
