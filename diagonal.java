import java.util.*;
 
public class diagonal
{
    public static void sum(int arr[][])
    {
        int sum = 0;

        for(int i = 0; i <= arr.length-1; i++)
        {
            for(int j = 0; j <= arr.length-1; j++)
            {
                if(i == j || i+j == arr.length-1)
                {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sum(arr);
    }
}