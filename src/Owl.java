public class Owl extends Animal implements Flyable{

    public Owl(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " the " + getClass().getName() +
                " says: 'Whoo whoo!'");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the " + getClass().getName() +
                " eats mice");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " the " + getClass().getName() +
                " flies between the trees");

    }
}
