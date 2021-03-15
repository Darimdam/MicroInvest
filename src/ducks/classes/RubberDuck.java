package ducks.classes;

import ducks.interfaces.Audible;
import ducks.interfaces.Eatable;
import ducks.interfaces.Swimable;
import ducks.interfaces.Walkable;

public class RubberDuck extends ToyDuck implements Audible{
    public RubberDuck(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public String makeSound() {
        return "squeek";
    }

    @Override
    public String swinm() {
        return "squeeky swimming";
    }

    @Override
    public String walk() {
        return "squeek squeek";
    }
}
