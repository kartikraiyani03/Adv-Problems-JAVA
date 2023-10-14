import java.util.*;
 
public class gridways
{
    public static int Grid(int arr[][],int row, int col)
    {
        if(row == arr.length-1 || col == arr.length-1)
        {
            return 1; 
        }

        int a = Grid(arr, row+1, col);
        int b = Grid(arr, row, col+1);
        return a+b;
    }


    public static void main(String args[])
    {
        int n = 3;
        int arr[][] = new int[n][n];

        System.out.println(Grid(arr, 0, 0));

    }
}

