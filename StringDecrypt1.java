package Exercises;
import java.util.*;
public class StringDecrypt1
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result="";
        for(int i=0;i<str.length();)
        {
            String temp="";
            int frequency=0;
            while(i<str.length() && str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                temp+=str.charAt(i);
                i++;
            }
            while(i<str.length() && str.charAt(i)>='1' && str.charAt(i)<='9')
            {
                frequency+=frequency*10+str.charAt(i)-'0';
                i++;
            }

            for(int j=1;j<=frequency;j++)
            {
                result+=temp;
            }
        }
        System.out.println(result);
    }

}
