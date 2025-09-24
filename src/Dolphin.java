public class Dolphin extends Animal implements Swimmable{


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " the " + getClass().getName() +
                " says: 'Squeak squeak!'");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the " + getClass().getName() +
                " eats: Sardines");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " the " + getClass().getName() +
                " swims in the big blue ocean");
    }
}
