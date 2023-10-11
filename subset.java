import java.util.*;
 
public class subset
{
    public static void Set(String str,int i, String ans)
    {
        if(i == str.length())
        {
            System.out.println(ans);
            return;
        }
        Set(str,i+1,ans+str.charAt(i));
        Set(str,i+1,ans);
    }

    public static void main(String args[])
    { 
        String str = "ABCD";
        Set(str, 0, "");
    }
}
