import java.util.*;
 
public class permutation
{
    public static void Perm(String str, String ans)
    {
        if(str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < str.length(); i++)
        {
            char Curr = str.charAt(i);
            String New = str.substring(0, i) + str.substring(i+1);
            Perm(New, ans+Curr);
        }
    }

    public static void main(String args[])
    {
        String name = "abc";
        Perm(name, "");

    }
}