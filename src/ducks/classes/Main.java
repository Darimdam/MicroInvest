package ducks.classes;

public class Main {
    public static void main(String[] args) {
        MallardDuck duckM = new MallardDuck(2,"green","George");
        RedheadDuck duckRH = new RedheadDuck(3, "white","Stan");
        RubberDuck duckR = new RubberDuck(5,"Yellow","Bob");

        System.out.println(duckM.makeSound());
        System.out.println(duckRH.fly());
        System.out.println(duckR.swinm());
    }
}
