import java.util.*;
 
public class typecast
{
    public static void main(String args[])
    {
        byte b;
        int i = 300;
        double d = 999.9;

        b = (byte) i;
        System.out.println(b);

        i = (int) d;
        System.out.println(i);

        b = (byte) d;
        System.out.println(b);
        
    }
}