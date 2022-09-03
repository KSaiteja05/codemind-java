import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        float m=n;
        float su=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            su+=a[i];
        }
        float avg=su/m;
        System.out.printf("%.2f",avg);
    }
}