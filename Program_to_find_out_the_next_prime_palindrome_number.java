import java.util.*;
class Main
{
    static int isprime(int n)
    {
        if(n<=1) return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) return 0;
        }
        return 1;
    }
    static int isprpalin(int n)
    {
        int r,s=0,x=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(x==s && isprime(x)==1) return 1;
        else return 0;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n=n+1;
        while(n!=0)
        {
            if(isprpalin(n)==1)
            {
                System.out.println(n);
                break;
            }
            else
            {
                n+=1;
            }
        }
    }
}