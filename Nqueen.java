import java.util.*;
 
public class Nqueen
{
    public static boolean safe(char arr[][], int row, int col)
    {
        for(int i = row-1; i >= 0; i--)
        {
            if(arr[i][col] == 'Q')
            {
                return false;
            }
        }

        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }

        for(int i = row-1, j = col+1; i >= 0 && j < arr.length; i--, j++)
        {
            if(arr[i][j] == 'Q')
            {
                return false;
            }
        }
        return true;
    }

    public static void PrintArray(char arr[][])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.print("["+arr[i][j]+"] ");
            
            }
            System.out.println();
        }
    }

    public static void board(char arr[][], int row)
    {
        if(row == arr.length)
        {
            PrintArray(arr);
            System.out.println();
            return;
        }
        for(int j = 0; j < arr.length; j++)
        {
            if(safe(arr,row,j))
            {
                arr[row][j] = 'Q';;
                board(arr, row+1);
                arr[row][j] = '.';
            }
        }
    }
    public static void main(String args[])
    {      
         int n = 5;

            char arr[][] = new char[n][n];

            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    arr[i][j] = '.';
                }
            }
        board(arr, 0);
    }
}