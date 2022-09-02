import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean p=false;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int x=s.nextInt();
        int y=s.nextInt();
        int max=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                continue;
                
            }
            else
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
                p=true;
            }
        }
        if(p==true)
        {
            System.out.println(max);
        }
        else
        {
            System.out.println(-1);
        }
    }
}