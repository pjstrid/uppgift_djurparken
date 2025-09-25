public abstract class Animal {

    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void makeSound();

    public abstract void eat ();

    public String getName(){
        return name;
    }
}
