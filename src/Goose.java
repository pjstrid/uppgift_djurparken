public class Goose extends Animal implements Flyable, Swimmable{

    public Goose(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " the " + getClass().getName() +
                " says: 'Quack Quack!'");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " the " + getClass().getName() +
                " eats breadcrumbs");

    }

    @Override
    public void fly() {
        System.out.println(this.name + " the " + getClass().getName() +
                " flies over the rooftops on the farm");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " the " + getClass().getName() +
                " swims in the little pond on the farm");

    }
}
