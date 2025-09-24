public class Duck extends Animal implements Flyable, Swimmable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Quack Quack!");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats: Breadcrumbs");

    }

    @Override
    public void fly() {
        System.out.println(this.name + " flies over the rooftops on the farm");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " swims in the little pond on the farm");

    }
}
