import java.util.*;
 
public class decimal
{
    public static void Dec(int n)
    {
        int decimal = 0;
        int pow = 0;

        while(n > 0)
        {
           int rem = n%2;
           decimal = decimal + (int)(rem*(Math.pow(10,pow)));
           n = n/2;
           pow++;
        }
        System.out.println(decimal);
    }
    public static void main(String args[])
    {
        Dec(6);

    }
}