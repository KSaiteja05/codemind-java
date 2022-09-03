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
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>min)
            {
                min=a[i];
            }
        }
         System.out.println(min);
        
    }
}