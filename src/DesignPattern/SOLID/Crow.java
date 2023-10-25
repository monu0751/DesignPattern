package DesignPattern.SOLID;

public class Crow extends Bird implements IFlyable{

    @Override
    void makeSound() {
        System.out.println("Kao kao");
    }

    @Override
    void eat() {
        System.out.println("Kha-char Sha-char");
    }

    @Override
    public void fly() {
        System.out.println("Fly Crow Fly");
    }
}
