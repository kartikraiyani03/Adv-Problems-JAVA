import java.util.*;
 
public class index
{
    public static void Index(int arr[],int i,int key)
    {
        int count = 0;
        if(i == arr.length)
        {
            return;
        }
      
        if(arr[i] == key)
        {
            System.out.println(i);
        }
        Index(arr,i+1,key);
    }

    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,2,5,2,2,2};
        Index(arr,0,2);
    }
}