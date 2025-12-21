public class Human{
    private String name;
    private int age;
    private boolean isStudent;

    public Human(String name,int age,boolean isStudent){
        this.name=name;
        this.age=age;
        this.isStudent=isStudent;
    }
    public void introduce(){
        System.out.println("I am a human.My name is "+name);
    }
    public boolean isAdult(){
        return age>=18;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public boolean isStudent(){
        return isStudent;
    }
    public void setStudent(boolean student){
        isStudent=student;
    }
}
