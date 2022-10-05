package th1.animals;

import th1.edible.IEdible;

public class Chicken extends th1.animals.Animals implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
