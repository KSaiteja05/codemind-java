import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x==a[i])
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}