import java.util.*;
 
public class primerange
{
    public static boolean prime(int n)
    {
        boolean isPrime = true;
       for(int i = 2; i <= n; i++)
       {
         if(n % i == 0)
         {
           isPrime = false;
           break;
         }

       }
       return isPrime;
    }

    public static void range(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(prime(i));
            {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[])
    {
        range(200);

    }
}