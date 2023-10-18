import java.util.*;
 
public class backtrack
{
    public static void PrintArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Back(int arr[],int i, int val)
    {
        if(i == arr.length)
        {
            PrintArray(arr);
            return;
        }

        arr[i] = val;
        Back(arr,i+1,val+1);
        arr[i] = arr[i] -1;
    }

    public static void main(String args[])
    {
        int arr[] = new int[5];
        Back(arr, 0, 0);
        PrintArray(arr);
    }
}