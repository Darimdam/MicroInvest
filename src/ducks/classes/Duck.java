package ducks.classes;

public abstract class Duck {
    int age;
    String color;
    String name;

    public Duck(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
}
