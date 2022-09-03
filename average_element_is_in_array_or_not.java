import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean p=false;
        int su=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            su+=a[i];
        }
        int avg=su/n;
        for(int i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                p=true;
            }
        }
        if(p==true)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}