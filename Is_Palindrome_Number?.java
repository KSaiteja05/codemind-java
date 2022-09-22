import java.util.*;
class Main
{
    static public int ispalin(int n)
    {
        int r,s=0,x=n;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==x) return 2;
        else return 1;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(ispalin(n)==2)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }
}