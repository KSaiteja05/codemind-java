import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l,r,k,cnt=0;
        l=s.nextInt();
        r=s.nextInt();
        k=s.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}