import java.util.*;
 
public class bit
{
    public static void BitMan(int n)
    {
        if((n & 1) == 0)
        {
            System.out.println("EVEN NUMBER");
        }
        else
        {
            System.out.println("ODD NUMBER");
        }
    }
    public static void main(String args[])
    {
        BitMan(3);
        BitMan(30);

    }
}