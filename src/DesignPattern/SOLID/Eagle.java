package DesignPattern.SOLID;

public class Eagle  extends Bird implements IFlyable{

    @Override
    void makeSound() {
        System.out.println("Hmmm");
    }

    @Override
    void eat() {
        System.out.println("Khach khach");
    }

    @Override
    public void fly() {
        System.out.println("Fly Eagle Fly");
    }
}
