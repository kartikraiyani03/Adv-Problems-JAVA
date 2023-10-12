import java.util.*;
 
public class rainwater
{
    public static void RainWater(int height[])
    {
        int Lmax[] = new int[height.length];
        Lmax[0] = height[0];

        for(int i = 1; i < height.length; i++)
        {
            Lmax[i] = Math.max(height[i], Lmax[i-1]);
        }

        int Rmax[] = new int[height.length];

        Rmax[height.length-1] = height[height.length-1];

        for(int i = height.length-2; i >= 0; i--)
        {
            Rmax[i] = Math.max(height[i], Rmax[i+1]);
        }

        int waterlevel[] = new int[height.length];
        for(int i = 0; i < height.length; i++)
        {
            waterlevel[i] = Math.min(Lmax[i],Rmax[i]);
        }

        int total[] = new int[height.length];
        
        for(int i = 0; i < height.length; i++)
        {
            total[i] = waterlevel[i] - height[i];
            if(total[i] < 0)
            {
                return;
            }
        }

        int sum = 0;
        for(int i = 0; i < height.length; i++)
        {
            sum = sum + total[i];
        }
        System.out.println("Collected Raiwater is "+sum);

    }
    public static void main(String args[])
    {
        int height[] = {4,2,0,6,3,2,5};
        RainWater(height);
    }
}