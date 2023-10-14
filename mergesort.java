import java.util.*;
 
public class mergesort
{
    public static void devide(int arr[],int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int mid = (si + ei) / 2;
        devide(arr, si, mid);
        devide(arr, mid+1, ei);
        conquer(arr,si,ei,mid);
    }

    public static void conquer(int arr[],int si,int ei,int mid)
    {
        int temp[] = new int[si-ei+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while( i <= mid &&  j <= ei)
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while(j <= ei)
        {
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; k < arr.length; k++, i++)
        {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1,4,5,2,3,8,9,0,1,2,4};
        devide(arr, 0, arr.length-1);

    }
}