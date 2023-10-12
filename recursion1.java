import java.util.*;
 
public class recursion1
{
    public static void decrease(int n)
    {
        if(n < 0)
        {
            return;
        }
        System.out.println(n);
        n--;
        decrease(n);
    }

    public static void increase(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        n--;
        increase(n);
        System.out.println(n);
    }

    public static double facto(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n*facto(n-1);
        }
    }

    public static int sum(int n)
    {
        if( n == 1)
        {
            return 1;
        }
        else
        {
            return n+(sum(n-1));
        }
    }

    public static void fibbo(double n,double a, double b)
    {
        if(n == 0)
        {
            return;
        }

        double c = a + b;
        System.out.print(c+", ");
        fibbo(n-1,b,c);
    }

    public static boolean sort(int arr[],int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return sort(arr,i+1);

    }

    public static int Last(int arr[], int key, int i)
    {
        if(arr[i] == key)
        {
            return i;
        }
        return Last(arr, key, i-1);
    }

    public static int power(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        return x*power(x,n-1);
    }

    public static int power2(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int half = power2(x,n/2);
        if(n % 2 != 0)
        {
            return x * half;
        }
        return half*half;
    }

    public static void unique(int n, int last, String str)
    {
        if(n == 0)
        {
            System.out.println(str);
            return;
        }

        unique(n-1, 0, str+"0");

        if(last == 0)
        {
           unique(n-1, 1, str+"1");
        }   
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,4,3,2,1,5};

        unique(3,0,"");

        // System.out.println(power(10,2));
        // System.out.println(power2(10,2));
        // System.out.println(Last(arr, 5, arr.length-1));
        // boolean n = sort(arr,0);
        // System.out.println(n);
        // decrease(10);
        // increase(10);
        //System.out.println(facto(5)); 
        //System.out.println(sum(3));
        // int n = 50;

        // int a = 0;
        // int b = 1;
        // System.out.print(a+", ");
        // System.out.print(b+", ");
        // fibbo(n-2,a,b);

    }
}