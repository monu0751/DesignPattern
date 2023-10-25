package DesignPattern.Strategy;

public class OnRoadDrive implements VehichleStreategy{
    @Override
    public void drive() {
        System.out.println("Drive on Road");
    }
}
