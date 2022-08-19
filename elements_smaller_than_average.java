import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double avg,s=0;
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s=s+a[i];
        }
        avg=s/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}