public class Dolphin extends Animal implements Swimmable{


    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Squeak squeak!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats: Sardines");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " swims in the big blue ocean");
    }
}
