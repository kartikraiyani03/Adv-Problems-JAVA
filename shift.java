import java.util.*;
 
public class shift
{
    public static void main(String args[])
    {
        int a = 219;
        int e = 31;
        int b = a << 1;
        int c = a >> 1;
        // System.out.println(b);
        // System.out.println(a);
        // System.out.println(c);

        // a = a | 4;
        // System.out.println(a);
        a = a^e;
        System.out.println(e);

    }
}