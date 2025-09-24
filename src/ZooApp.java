import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {

    List<Animal> animals = new ArrayList<>();

    public ZooApp(){
        initList();
        presentAnimals();
        featuresOfAnimals();
    }

    private void presentAnimals() {
        System.out.println("All the animals presents themself:");
        System.out.println();
        for (Animal animal : animals) {
            System.out.println(animal.name + ": " + "'I am " + animal.name + " the " + animal.getClass().getName() + "'");
        }
    }

    private void featuresOfAnimals(){
        System.out.println();
        System.out.println("This is what all of the animals do:");

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
    }

    private void initList(){
        animals.add(new Dolphin("Dave"));
        animals.add(new Owl("Owen"));
        animals.add(new Goose("Glen"));
        animals.add(new Sloth("Stan"));

    }
}
