package model;

public abstract class Human {

    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showInfo();

    public void rest() {
        System.out.println("Human is having a break");
    }
}
