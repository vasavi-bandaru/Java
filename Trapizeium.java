public class Main
{
    public static void main(String args[])
    {
        int n=4;
        for(int i=n;i>0;i--)
        {
            int t=i;
            int x=n;
            while(t!=0)
            {
                System.out.print(" ");
                t--;
            }
            while(x!=0)
            {
                System.out.print("* ");
                x--;
            }
            System.out.println("");
        }
    }
}