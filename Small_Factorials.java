import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,su;
        n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            su=1;
            int a=s.nextInt();
            for(int j=1;j<=a;j++)
            {
                su*=j;
            }
            System.out.println(su);
        }
        
    }
}