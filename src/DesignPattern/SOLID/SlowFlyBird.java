package DesignPattern.SOLID;

public class SlowFlyBird implements IFlyBehavior{

    @Override
    public void doFlyAsYouWant() {
        System.out.println("Fly slow and steady... get the target");
    }
}
