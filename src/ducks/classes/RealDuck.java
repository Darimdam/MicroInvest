package ducks.classes;

import ducks.classes.Duck;
import ducks.interfaces.Audible;
import ducks.interfaces.Eatable;
import ducks.interfaces.Swimable;
import ducks.interfaces.Walkable;

public abstract class RealDuck extends Duck implements Audible, Eatable, Swimable, Walkable {

    public RealDuck(int age, String color, String name) {
        super(age, color, name);
    }


    @Override
    public String makeSound() {
        return "quack";
    }

    @Override
    public String eat() {
        return "monch";
    }

    @Override
    public String swinm() {
        return "Swimming";
    }

    @Override
    public String walk() {
        return "tap tap";
    }
}
