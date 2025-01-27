package constructor;

class Animal
{
    public void m1()
    {
        System.out.println("m1");
    }

    public void sum(int a, int b)
    {
        System.out.println(a+b);
    }

    //How to create custom constructor
    Animal()
    {
        System.out.println("Constructor chal raha hai...");
    }

    Animal(char arr[])
    {

    }
}
public class Demo
{
    public static void main(String[] args)
    {
        //default constructor
        Animal a=new Animal();
        a.m1();
        a.sum(4,2);

        char arr[]={'a','b','c'};
        Animal aa=new Animal(arr);
        a.sum(2,2);
    }
}
