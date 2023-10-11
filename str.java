import java.util.*;

public class str
{
    public static void rev(String name,int index)
    {
        if(index == 0)
        {
            return;
        }
        System.out.print(name.charAt(index));
        rev(name,index-1);
    }
 
    public static void main(String args[])
    {

        String name = "Kartik";
        rev(name,name.length()-1);
    }
}