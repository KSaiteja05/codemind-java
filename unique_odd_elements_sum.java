import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int cnt=0;
        int a[]=new int[n];
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
    	{
    		b[i]=false;
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(b[i]==true)
    		{
    			continue;
    		}
    		for(int j=0;j<n;j++)
    		{
    			if(a[i]==a[j])
    			{
    				b[j]=true;
    			}
    		}
    		if(a[i]%2==1)
    		{
    		    cnt=cnt+a[i];
    		}
    	}
    	System.out.println(cnt);
    }
}