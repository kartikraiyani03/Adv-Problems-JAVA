import java.util.*;
 
public class compression
{
    public static void Comp(String str)
    {
        String newStr = "";
        
        for(int i = 0; i < str.length()-1; i++)
        {
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++; 
            }

            newStr = newStr + str.charAt(i);
            
            if(count > 1)
            {
                newStr = newStr + count.toString();
            }
        }
        System.out.println(newStr);
    }

    public static void main(String args[])
    {
        String str = "aabbcc";
        Comp(str);

    }
}