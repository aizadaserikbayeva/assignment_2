public class Employee extends Human{
    private String position;
    private float salary;
    public static String companyName="Kazmedia";

    public Employee(String name,int age,boolean isStudent,String position,float salary){
        super(name,age,isStudent);
        this.position=position;
        this.salary=salary;
    }

    @Override
    public void introduce(){
        System.out.println("I am employee.My position is "+ position);
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public float getSalary(){
        this.salary=salary;
        return salary;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
}