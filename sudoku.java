import java.util.*;
 
public class sudoku
{
    public static void PrintArray(int arr[][])
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

    public static boolean safe(int arr[][], int row, int col, int digit)
    {
        for(int i = 0; i <= 8; i++)
        {
            if(arr[i][col] == digit)
            {
                return false;
            }
        }

        for(int j = 0; j <= 8; j++)
        {
            if(arr[row][j] == digit)
            {
                return false;
            }
        }

        int nr = (row/3) * 3;
        int nc = (col/3) * 3;

        for(int i = nr; i < nr+3; i++)
        {
            for(int j = nc; j < nc+3; j++)
            {
                if(arr[i][j] == digit)
                {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean Sudoku(int arr[][], int row, int col)
    {
        if(row == 9)
        {
            return true;
        }

        int nextRow = row;
        int nextCol = col+1;

        if(col+1 == 9)
        {
            nextRow = row+1;
            col = 0;
        }

        if(arr[row][col] != 0)
        {
            return Sudoku(arr, nextRow, nextCol);
        }

        for(int digit = 1; digit <= 9; digit++)
        {
            if(safe(arr, nextRow, nextCol,digit))
            {
                arr[row][col] = digit;
                if(Sudoku(arr, nextRow, nextCol));
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        int arr[][] = {
            {0,0,0,8,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };

        if(Sudoku(arr, 0, 0))
        {
            PrintArray(arr);
        }

    }
}