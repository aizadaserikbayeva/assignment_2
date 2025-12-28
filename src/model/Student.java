package model;

import Interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void study() {
        System.out.println("Student is learning new topic");
    }

    @Override
    public void takeTest() {
        System.out.println("Student is writing an exam");
    }

    @Override
    public void showInfo() {
        System.out.println("Student info: " + name + ", age: " + age);
    }

    public final void showFaculty() {
        System.out.println("Major: " + major);
    }
}
