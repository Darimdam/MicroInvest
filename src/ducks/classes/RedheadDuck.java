package ducks.classes;

import ducks.interfaces.Flyable;

public class RedheadDuck extends RealDuck implements Flyable {
    public RedheadDuck(int age, String color, String name) {
        super(age, color, name);
    }

    @Override
    public String fly() {
        return "I am flying";
    }
}
