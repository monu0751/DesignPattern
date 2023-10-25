package DesignPattern.SOLID;

public class Peacock  extends Bird implements IFlyable, IDanceable{

    @Override
    void makeSound() {
        System.out.println("Meo Meo");
    }

    @Override
    void eat() {
        System.out.println("Kha-char Sha-char");
    }

    @Override
    public void fly() {
        System.out.println("Fly very low");
    }

    @Override
    public void dance() {
        System.out.println("La la la la");
    }
}
