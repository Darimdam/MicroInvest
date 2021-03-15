package ducks.classes;


import ducks.interfaces.Swimable;
import ducks.interfaces.Walkable;

public class ToyDuck extends Duck implements Swimable, Walkable {
    public ToyDuck(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public String swinm() {
        return "clank";
    }

    @Override
    public String walk() {
        return "clank clank";
    }
}
