import java.util.*;

class Student 
{
    int a;
    int b;

    Student(int aa,int bb)
    {
        this.a = aa;
        this.b = bb;
    }

    void value(Student s)
    {
        s.a +=1;
        s.b +=1;
    }
}
 
public class call
{
    public static void main(String args[])
    {
        Student s = new Student(10,10);
 
        System.out.println(s.a+" "+s.b);
        s.value(s);
        System.out.println(s.a+" "+s.b);
    }
}