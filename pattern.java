import java.util.*;
 
public class pattern
{
    public static void main(String args[])
    {
        
        for(int i= 10; i >= 1; i--)
        {
            int j,k;

            for(j = 1; j <= i-1;j++)
            {
                System.out.print(" ");
            }
            for(k = 10; k >= j; k--)
            {     
                System.out.print("* ");
            }
             System.out.println();
        }

        for(int i= 2; i <= 10; i++)
        {
            int j,k;
            for(j = 1; j <= i-1;j++)
            {
                System.out.print(" ");
            }
            for(k = 10; k >= j; k--)
            {     
                System.out.print("* ");
            }
             System.out.println();
        }

        // for(int i=1; i <= 5; i++)
        // {
        //     for(int j=1;j <= i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1; i <= 5; i++)
        // {
        //     for(int j=1;j <= 5-i; j++)
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int l;

        for(int i = 1; i <= 5; i++)
        {
            for( l = 5; l >= i; l--)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= l; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 5; j++)
            {
                if(i == 0 || i == 5 || j == 0 || j == 5)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}