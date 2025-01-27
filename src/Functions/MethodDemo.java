package Functions;

class Student
{
    public void study()
    {
        System.out.println("Study");
    }

    public int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }

    public String userName()
    {
        return "Hii Hello";
    }

    public void name()
    {
        System.out.println(userName());
    }
}
public class MethodDemo
{
    public static void main(String[] args) {
        Student student=new Student();
        student.study();

        System.out.println(student.sum(10,10)); // pahila tarika

        int res= student.sum(10,10); //Dusara Tarika
        System.out.println(res);

        String name=student.userName();
        System.out.println(name);

        student.name();

    }
}
