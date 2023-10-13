import java.util.*;

class A 
{
    void display()
    {
        System.out.println("Hey");
    }
}
class B extends A
{
    void display()
    {
       System.out.println("Hello");
    }
}

public class override
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();

        a.display();
        b.display();
    }
}