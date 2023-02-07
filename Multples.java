import java.util.*;
public class Sample{
    public static void main(String args[]){
    int n=1000;
    int sum=0;
    for(int i=3;i<1000;i+=3)
    {
        if(i%3==0)
        {
            
            sum+=i;
        }
    }
    for(int i=5;i<1000;i+=5)
    {
        if(i%5==0&&i%3!=0)
        {
            
            sum+=i;
        }
    }
    System.out.println(sum);
    }
}