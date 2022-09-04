import java.util.*;
class Main
{
    public static boolean isprime(int n)
    {
        if(n<=1) return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int i=a+b;
        int cp=i;
        if(isprime(i)==true)
        {
            i=i+1;
        }
        while(a!=0)
        {
            if(isprime(i)==true)
            {
                System.out.println(i-cp);
                break;
            }
            else
            {
                i+=1;
            }
        }
        
    }
}