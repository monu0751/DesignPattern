package DesignPattern.SOLID;

public class Dove extends Bird implements IFlyable,IDanceable{

    IFlyBehavior flyBehavior;

    public Dove(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Dove() {
    }

    @Override
    void makeSound() {
        System.out.println("Gutur Goo");
    }

    @Override
    void eat() {
        System.out.println("tak tak");
    }

    @Override
    public void fly() {
        flyBehavior.doFlyAsYouWant();
    }

    @Override
    public void dance() {

    }
}
