import DesignPattern.SOLID.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FastFlyBird fastFlyBird = new FastFlyBird();
        SlowFlyBird slowFlyBird = new SlowFlyBird();
        IFlyable flyableBird = new Dove(fastFlyBird);
        flyableBird.fly();
        IFlyable slowFlyableBird = new Dove(slowFlyBird);
        slowFlyableBird.fly();
        IDanceable danceableBird = new Dove();
        danceableBird.dance();


    }
}