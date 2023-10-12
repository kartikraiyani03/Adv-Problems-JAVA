import java.util.*;
 
public class revarray
{
    public static void RevArray(int a[])
    {
        int first = 0;
        int last = a.length;
        int temp;

        while(first < last)
        {
            temp = a[first];
            a[first] = a[last];
            a[last] = temp;

            first++;
            last--;
        }

        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6};
        RevArray(arr);
    }
}