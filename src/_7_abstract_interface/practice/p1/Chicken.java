package _7_abstract_interface.practice.p1;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cluck - Cluck!";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
