import java.util.*;
 
public class binarysearch2
{
    public static int search(int arr[], int si, int ei , int key)
    {
        if(si > ei)
        {
            return -1;
        }
        int mid = (si + ei)/2;

        if(key == arr[mid])
        {
            return  mid;
        }

        if(arr[si] >= arr[mid])
        {
            if(arr[si] <= key && arr[mid] >= key)
            {
                return search(arr, si, mid, key);
            }
            else
            {
                return search(arr, mid+1, ei, key);
            }
        }
        else
        {
            if(arr[mid+1] <= key && arr[ei] >= key)
            {
                return search(arr, si, mid, key);
            }
            else
            {
                return search(arr, mid+1, ei, key);
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,0,2,3,4};
        System.out.println(search(arr, 0, arr.length-1, 2));

    }
}