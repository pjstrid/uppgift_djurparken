import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZooApp {

    static List<Animal> animals = new ArrayList<>();

    public ZooApp(){
        initList();
        System.out.println("To start, press 'ENTER'");
        InputHandler.getString();
        presentAnimals();
        InputHandler.getString();
        featuresOfAnimals();
        InputHandler.getString();
        currentActivity();

    }



    public static void presentAnimals() {
        System.out.println("All of the animals now presents themself:");
        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal.name + ": " + "'I am " + animal.name + " the " + animal.getClass().getName() + "'");
        }
        System.out.println("-------------------------");
        System.out.println("To continue, press 'ENTER'");

    }

    public static void featuresOfAnimals(){
        System.out.println("This is what all of the animals can do:");

        for (Animal animal : animals) {
            System.out.println();
            animal.eat();
            animal.makeSound();

            if (animal instanceof Swimmable s){
                s.swim();
            }
            if (animal instanceof Flyable f){
                f.fly();
            }
        }
        System.out.println("-------------------------");
        System.out.println("To continue, press 'ENTER'");
    }

    public static void currentActivity(){
        System.out.println("This is what the animals do right now:");
        System.out.println();
        for (Animal animal : animals){
            Random random = new Random();
            int randomNumber = random.nextInt(1, 5);

            if (randomNumber == 1) {

                animal.eat();
            } else if (randomNumber == 2) {

                animal.makeSound();
            } else if (randomNumber == 3) {

                if (animal instanceof Swimmable s){
                    s.swim();
                } else{
                    animal.makeSound();
                    System.out.print("because he can't swim");
                    System.out.println();
                }
            } else if (randomNumber == 4){

                if (animal instanceof Flyable f){
                    f.fly();
                } else {
                    animal.eat();
                    System.out.print("because he can't fly");
                    System.out.println();
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("To quit, press 'ENTER'");
    }

    public static void initList(){
        animals.add(new Dolphin("Dave"));
        animals.add(new Owl("Owen"));
        animals.add(new Goose("Glen"));
        animals.add(new Sloth("Stan"));

    }
}
