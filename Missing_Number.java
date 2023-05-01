import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n-1;i++) 
        {
            arr[i]=s.nextInt();
            sum=sum^arr[i];
        }
        int sum2=0;
        for(int i=1;i<=n;i++) sum2=sum2^i;
        System.out.println(sum^sum2);
    }
}