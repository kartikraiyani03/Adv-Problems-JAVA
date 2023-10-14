import java.util.*;
 
public class ncr
{
    public static int fact(int n)
    {
        int fact=1;
        
        for(int i = 1; i < n; i++)
        {
            fact = fact*i;
        }

        return fact;
    }
    public static int binomial(int n,int r)
    {
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);

        int result = a/(b*c);

        return result;
    }
    public static void main(String args[])
    {
        System.out.println(binomial(10,6));
    }
}