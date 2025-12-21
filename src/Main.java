import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Name:");
        String name =scanner.nextLine();

        System.out.print("Age:");
        int age =scanner.nextInt();

        System.out.print("Are you student(true/false):");
        boolean isStudent=scanner.nextBoolean();

        Human human=new Human(name,age,isStudent);

        human.introduce();
        System.out.println("Is adult:"+human.isAdult());

        Employee employee=new Employee(
                "Aizada",17,true,"Designer",100000
        );
        employee.introduce();
        System.out.println("Company:"+Employee.companyName);

        Student student=new Student(
                "Akzer",20,false,"Media Technology",2.7f
        );

        student.introduce();
        student.setGpa(3.8f);
        System.out.println("Updated Gpa:"+student.getGpa());




    }
}
