import java.util.*;
 
public class trycatch
{
    public static void main(String args[])
    {
        try
        {
            int a =0;
            int b = 89/a;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

    }
}