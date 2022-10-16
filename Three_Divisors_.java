import java.util.*;
class Main
{
    static int isPrime(int n)
    {
        if(n<=1) return 0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        for (int i = 2; i * i <= n; i++) 
        {
             if (isPrime(i)==1) {
                if (i * i <= n) 
                {
                    cnt+=1;
                }
            }
        }
        System.out.println(cnt);
    }
}