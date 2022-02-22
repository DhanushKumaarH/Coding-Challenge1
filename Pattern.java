package Exercises;
import java.util.*;
public class Pattern
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int val=1;
        for(int i=0;i<rows;i++)
        {
            for(int j=1;j<rows-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                if(i==0 || j==0)
                {
                    val=1;
                }
                else
                {
                    val=val*(i-j+1)/j;
                }
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}