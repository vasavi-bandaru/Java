// sum of all multiples of 3 or 5 below 1000

import java.util.*;
public class Multiples{
    public static void main(String args[]){
    int n=1000;
    int sum=0;
    for(int i=3;i<1000;i++)
    {
        if(i%3==0||i%5==0)
        {
            sum+=i;
        }
    }
    System.out.println(sum);
    }
}
