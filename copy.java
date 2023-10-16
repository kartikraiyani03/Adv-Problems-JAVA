import java.util.*;

class Parent
{
    String name;
    int mark;

    Parent(String n,int m)
    {
        this.name = n;
        this.mark = m;
    }
    Parent(Parent p)
    {
        this.name = p.name;
        this.mark = p.mark;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(mark);
    }
}
 
public class copy
{
    public static void main(String args[])
    {   
        Parent p = new Parent("abc",65);
        Parent p1 = new Parent(p);
        p1.display();

    }
}