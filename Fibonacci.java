/* Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be: 
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms. */

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