package DesignPattern.SOLID;

abstract class Bird {
    String name;
    String type;
    int weight;
    int height;
    String color;

    abstract void makeSound();
    abstract void eat();
}
