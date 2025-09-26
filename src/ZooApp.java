import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ZooApp {

    static List<Animal> animals = new ArrayList<>();

    public ZooApp(){
        initList();
        System.out.println("To start, press 'ENTER'");
        InputHandler.getString(); // Denna rad gör så det krävs ett enter-tryck för att fortsätta
        greetingFromAnimals();
        InputHandler.getString(); // Samma här
        featuresOfAnimals();
        InputHandler.getString(); // Samma här
        currentActivity();

    }


// Metod som gör så att djuren presenterar sig
    public static void greetingFromAnimals() {
        System.out.println("Here is a greeting from all of the animals:");
        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal.name + ": " + "'Hi, I am " +             // Hämtar namnet på djuret från ArrayList
                                 animal.name + " the " +
                                    animal.getClass().getName() + "'");    // Hämtar vilken klass djuret tillhör
        }
        System.out.println("-------------------------");
        System.out.println("To continue, press 'ENTER'");
    }


// Metod som visar alla attribut för varje djur
    public static void featuresOfAnimals(){
        System.out.println("This is how the animals eat, speak and their favourite activity:");

        for (Animal animal : animals) {
            System.out.println();
            animal.eat();
            animal.makeSound();

            if (animal instanceof Swimmable s){     // om djuret kan simma skrivs det ut, hämtar info från interface
                s.swim();                           // annars ingen utskrift här på det djuret
            }
            if (animal instanceof Flyable f){       //  hämtar info från interface
                f.fly();                            // om djuret kan flyga skrivs det ut,
                                                    // annars ingen utskrift här på det djuret
            }
        }
        System.out.println("-------------------------");
        System.out.println("To continue, press 'ENTER'");
    }


// Metod som slumpar fram en aktuell aktivitet för varje djur
    public static void currentActivity(){
        System.out.println("This is what the animals do right now:");
        System.out.println();
        for (Animal animal : animals){
            Random random = new Random();
            int randomNumber = random.nextInt(1, 5);    // upprepad slumpvis siffra mellan 1 och 4 för varje djur

            if (randomNumber == 1) {
                animal.eat();

            } else if (randomNumber == 2) {
                animal.makeSound();

            } else if (randomNumber == 3) {

                if (animal instanceof Swimmable s){ // om den kan simma, skrivs det ut
                    s.swim();
                } else{                            // om djuret inte har ett tredje attribut, kommer denne göra sitt läte
                    animal.makeSound();
                    System.out.print("because he can't swim");
                    System.out.println();
                }
            } else if (randomNumber == 4){

                if (animal instanceof Flyable f){   // om den kan flyga, skrivs det ut
                    f.fly();
                } else {                           // om djuret inte har ett fjärde attribut, kommer denne äta sin mat
                    animal.eat();
                    System.out.print("because he can't fly");
                    System.out.println();
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("To quit, press 'ENTER'");
    }


// Skapar lista med fyra djur
    public static void initList(){
        animals.add(new Dolphin("Dave"));
        animals.add(new Owl("Owen"));
        animals.add(new Goose("Glen"));
        animals.add(new Sloth("Stan"));

    }
}
