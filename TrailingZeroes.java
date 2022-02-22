package Exercises;
import java.util.*;
public class TrailingZeroes
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1,check,count=0;
        for(int i=num;i>0;i--)
        {
            fact=fact*i;
        }
        check=fact;
        while(check%10==0)
        {
            count++;
            check/=10;
        }
        System.out.println(fact+" "+count);
    }
}
