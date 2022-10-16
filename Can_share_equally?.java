import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if(a==0 && b%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0 && b%2!=0)
        {
            System.out.println("NO");
        }
        else if((a+(b*2))%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}