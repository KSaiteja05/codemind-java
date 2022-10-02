import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int x=0,y=0,cnt=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                x=i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
            {
                y=i;
            }
        }
        for(int i=x+1;i<y;i++)
        {
            if(a[i]%2==0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}