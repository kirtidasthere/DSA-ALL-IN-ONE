package OOPS;
// Multilevel Inheritance
class SuperDad
{
    int a=10;
    public void plot()
    {
        System.out.println("200 gaj ka plot");
    }
}
class Dad extends SuperDad
{

}

class Kirtidas extends Dad
{
    public void name()
    {
        System.out.println("Kirtidas");
    }
}

public class Test
{
    public static void main(String[] args) {
        Kirtidas kirtidas=new Kirtidas();
        kirtidas.plot();
        System.out.println(kirtidas.a);
        kirtidas.name();

    }
}
