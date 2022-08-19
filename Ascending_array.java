import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        boolean p=true;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(a[i]<=a[i-1])
            {
                p=false;
            }
        }
        if(p==true)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}