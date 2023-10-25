package DesignPattern.Strategy;

public class OffRoadDrive implements VehichleStreategy{
    @Override
    public void drive() {
        System.out.println("Drive off road");
    }
}
