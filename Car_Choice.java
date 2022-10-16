import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
            float a,b,c,d;
            a=s.nextFloat();
            b=s.nextFloat();
            c=s.nextFloat();
            d=s.nextFloat();
            float c1=c/a;
            float c2=d/b;
            if(c1<c2)
            {
                System.out.println(-1);
            }
            else if(c1==c2)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
        
    }
}