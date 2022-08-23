import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int a=0,b=1,c;
        while(cnt!=n)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            cnt++;
        }
    }
}