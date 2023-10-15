import java.util.*;
 
public class expo
{
    public static void fastExpo(int a, int n)
    {
        int ans = 1;
        while(n > 0)
        {
            if((n & 1) != 0)
            {
                ans = ans * a;
            }
            n = n >> 1;
            a = a * a;
        }
        System.out.println(ans);
    }

    public static void main(String args[])
    {
        fastExpo(2,20);

    }
}