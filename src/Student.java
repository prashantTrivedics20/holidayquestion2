import java.util.Scanner;
public abstract class Student {
    String name;
    int age;
    String program;
    Student(String name,int age,String program)
    {
        this.name=name;
        this.age=age;
        this.program=program;
    }
    public abstract void display_stu_info();
}
class graduate_student extends Student
{
    int percentage;
    String  stream;
    graduate_student(int a,String s,String n,int age,String pr)
    {
        super(n,age,pr);
        percentage=a;
        stream=s;
    }
    @Override
    public void display_stu_info() {
        System.out.println("graguate_student details");
        System.out.println("\n");
        System.out.println(percentage+"\t\t"+ stream+"\t\t"+name+"\t\t"+age+"\t\t"+program);
        System.out.println("\n");
    }
}
class Research_student extends Student
{
    String specialization;
    int year_of_experience;
    Research_student(String spe,int year,String n,int age,String pr) {
        super(n, age, pr);
        specialization = spe;
        year_of_experience = year;
    }
    @Override
    public void display_stu_info() {
        System.out.println("\n");
        System.out.println("Research_student details");
        System.out.println("\n");
        System.out.println(specialization+"\t\t"+year_of_experience+"\t\t"+name+"\t\t"+age+"\t\t"+program);
    }
}
class test
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        graduate_student obj=new graduate_student(readme.nextInt(),readme.nextLine(),readme.nextLine(),readme.nextInt(),readme.nextLine());
        Research_student obj1=new Research_student(readme.next(),readme.nextInt(),readme.next(),readme.nextInt(),readme.next());
        obj.display_stu_info();
        obj1.display_stu_info();
    }
}
