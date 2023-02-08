//sum of even numbers of first 4 million fibonacci series
import java.util.*;
public class Fibo{
    public static void main(String args[])
    {
        int n=4000000;
        int f1=3,f2=5,f=f1+f2;
        int sum=2;
        int c=0;
        while(f<4000000)
        {
            c++;
            sum+=f;
            f1=f2+f;
            f2=f+f1;
            f=f1+f2;
        }
        System.out.println(sum+" "+c);
    }
}
