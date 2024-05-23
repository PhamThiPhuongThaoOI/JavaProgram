package Lap06.exs105;

public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                '}';
    }
}
