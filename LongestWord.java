package Exercises;
import java.util.*;
public class LongestWord
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine(),temp="";
        String arr[]=str.split("\\s");
        String word="";
        int length=0;
        for(String i:arr)
        {
            if(i.length()>length)
            {
                word=i;
                length=i.length();
            }
        }
        System.out.println(word+" "+length);
    }
}
