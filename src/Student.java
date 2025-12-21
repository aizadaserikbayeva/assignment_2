public class Student extends Human{
    private String major;
    private float gpa;

    public Student(String name,int age,boolean isStudent,String major,float gpa){
        super(name,age,isStudent);
        this.major=major;
        this.gpa=gpa;
    }
    @Override
    public void introduce(){
        System.out.println("I am a student.My major is "+ major);
    }
    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public float getGpa(){
        return gpa;
    }
    public void setGpa(float gpa){
        this.gpa=gpa;
    }
}