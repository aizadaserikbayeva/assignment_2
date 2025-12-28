package model;

import Interfaces.IStudy;
import Interfaces.IWork;

public class Employee extends Human implements IStudy, IWork {

    private String jobTitle;

    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    @Override
    public void study() {
        System.out.println("Employee is improving skills");
    }

    @Override
    public void takeTest() {
        System.out.println("Employee passed qualification test");
    }

    @Override
    public void work() {
        System.out.println("Employee is working");
    }

    @Override
    public void receivePayment() {
        System.out.println("Employee got monthly payment");
    }

    @Override
    public void showInfo() {
        System.out.println("Employee: " + name + ", age: " + age);
    }
}
