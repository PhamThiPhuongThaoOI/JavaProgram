package Lap06.exs105;

public class Cat extends Mammal{
    public Cat ( String name) {
        super(name);
    }
    public void greets() {
        this.name = name;
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString()+
                "name='" + name + '\'' +
                '}';
    }
}
