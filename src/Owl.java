public class Owl extends Animal implements Flyable{

    public Owl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Whoo whoo!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats: Mice");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " flies between the trees");

    }
}
