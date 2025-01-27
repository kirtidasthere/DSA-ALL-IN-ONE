package Bit;

public class Swap
{
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        a=a^b; // XOR operator ---> ^
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
