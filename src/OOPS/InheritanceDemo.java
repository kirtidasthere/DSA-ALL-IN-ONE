package OOPS;

class A
{
    public  void m1()
    {
        System.out.println("Hello .... m1");
    }
    public void m2()
    {
        System.out.println("Hello ... m2");
    }
}
class B extends A
{
    @Override
    public void m1() {
        System.out.println("Hello class B m1 method");
    }

    @Override
    public void m2() {
        System.out.println("Hello class B m2 method");
    }
}
public class InheritanceDemo
{
    public static void main(String[] args) {

        B b=new B();
        b.m1();
        b.m2();
    }
}
