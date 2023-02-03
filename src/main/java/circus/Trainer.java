package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting
        getToSpeak(bird);

        Animal animal = (Animal) bird; // upcasting
        getToSpeak(animal);

        Duck duck2 = (Duck) animal; // downcasting
        getToSpeak(duck2);

        train(new Duck());
        // train(new Parrot());

        Animal animal2 = new Animal();
        Bird bird2 = new Bird();

    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) { // try not to use instanceof unless input is not controllable
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not oa duck! Not a duck!");
        }
    }
}
