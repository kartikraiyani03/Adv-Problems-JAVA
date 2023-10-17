import java.util.*;
 
public class charat
{
    public static void print(String str, int index)
    {
        if(index == 0)
        {
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        print(str,index-1);
    }
    public static void main(String args[])
    {
        String str = "name";
        print(str,str.length()-1);

    }
}