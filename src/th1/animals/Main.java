
package th1.animals;

import th1.edible.IEdible;

    public class Main {

        public static void main(String[] args) {
            th1.animals.Animals[] animals = new th1.animals.Animals[2];
            animals[0] = new Tiger();
            animals[1] = new th1.animals.Chicken();
            for (th1.animals.Animals animal : animals) {
                System.out.println(animal.makeSound());

                if (animal instanceof th1.animals.Chicken) {
                    IEdible edible = (th1.animals.Chicken) animal;
                    System.out.println(edible.howToEat());
                }

            }
        }
}