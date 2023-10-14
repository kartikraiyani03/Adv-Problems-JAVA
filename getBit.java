import java.util.*;
 
public class getBit
{
    public static int get(int n,int i)
    {
        int mask = 1>>i;
        if((n & mask) == 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
    public static int clear(int n,int i)
    {
        int mask = ~(1<<i);
        return n & mask;
    }

    public static void main(String args[])
    {
        System.out.println(get(4,1));
        System.out.println(clear(4,2));
    }
}

