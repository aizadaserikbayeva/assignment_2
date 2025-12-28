package main;

import Interfaces.IStudy;
import Interfaces.IWork;
import model.Employee;
import model.Human;
import model.Student;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Aizada", 17, "IT");


        Human human1 = new Employee("Adil", 21, "Media Technology");


        IStudy studyRef = new Student("Han", 29, "Economics");
        IWork workRef = new Employee("Akzer", 27, "Manager");

        student1.study();
        student1.takeTest();
        student1.showFaculty();
        student1.showInfo();

        System.out.println();

        human1.showInfo();
        human1.rest();

        System.out.println();

        studyRef.study();
        workRef.work();
        workRef.receivePayment();
    }
}
