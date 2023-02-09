import java.util.*;
public class SumSqr{
    public static void main(String args[]){
        int n=100;
        int ssum=(n*(n+1)*((2*n)+1))/6;
        int s=(n*(n+1))/2;
        int sum=s*s;
        int res=sum-ssum
        System.out.println(res);
    }
}
