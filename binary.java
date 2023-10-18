import java.util.*;
 
public class binary
{
    public static void convert(int binary)
    {
        int decimal = 0;
        int pow = 0;
        while(binary > 0)
        { 
            int digit;
            digit = binary % 10;
            decimal = decimal + (int) (digit * Math.pow(2, pow));
            binary = binary / 10;
            pow++;
        }
        System.out.println("Binary : "+ binary +" Decimal : "+decimal);
    }
    public static void main(String args[])
    {
        convert(101);

    }
}