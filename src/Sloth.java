public class Sloth extends Animal{

    public Sloth(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Zzz Zzz...");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " eats: Leafs");
    }

}
