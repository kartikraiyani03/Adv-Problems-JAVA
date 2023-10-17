import java.util.*;

class Student
{
    int a;
    int b;

    void value(int aa,int bb)
    {
        this.a = aa;
        this.b = bb;
    }

}
 
public class callValue
{
    public static void main(String args[])
    {
        Student s = new Student();
        int a = 10;
        int b = 10;
    
        System.out.println(a+" "+b);
        s.value(a,b);
        System.out.println(a+" "+b);


    }
}