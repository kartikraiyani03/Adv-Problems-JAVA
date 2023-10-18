import java.util.*;

import javax.xml.transform.Source;
 
public class advpattern
{
    public static void main(String args[])
    {
        // *****************************

        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        //**********************************
        
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 5-i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
        System.out.println();

        //********************************** 

        for(int i = 0; i <= 5; i++)
        {
           for(int j = 0; j <= 5-i-1; j++)
           {
             System.out.print(" ");
           }
           for(int k = 0; k <= i; k++)
           {
               System.out.print("*");
           }
           System.out.println();
        }

        System.out.println();

        //**************************************** 

        for(int i = 0; i <= 5; i++)
        {
           for(int j = 0; j <= i-1; j++)
           {
             System.out.print(" ");
           }
           for(int k = 0; k <= 5-i; k++)
           {
               System.out.print("*");
           }
           System.out.println();
        }

        // *****************************************************

        for(int i = 0; i <=5; i++)
        {
            for(int j = 1; j <= 5-i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        // ************************************************
        
        int k =1;
        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        System.out.println();

        // **************************************************

        for(int i= 0; i <= 5; i++)
        {
            for( int j = 0; j <=i; j++)
            {
                if((i+j) % 2 == 0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        System.out.println();

        // ***************************************************

        for(int i = 0; i <=5; i++)
        {
            for(int j = 0; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for(int m = 0; m <= 5; m++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // ************************************************

        for(int i = 0; i <= 5; i++)
        {
            for(int j = 0; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for(int m = 0; m <= 5; m++)
            {
                if(m == 5 || i == 0 || i == 5 || m == 0)
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

        // *****************************************************

        System.out.println();
        
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 0; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for(int m =1; m <= i; m++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        // *****************************************************
        
        System.out.println();

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5-i; j++)
            {
                System.out.print(" ");
            }
            for(int m = i; m >= 1; m--)
            {
                System.out.print(m);
            }
            for(int p = 2; p <= i; p++)
            {
                System.out.print(p);
            }
            System.out.println();
        }
        
    }
}