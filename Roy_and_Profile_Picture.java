import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int w=s.nextInt();
            int h=s.nextInt();
            if(w>=l && h>=l)
            {
                if(w==h)
                {
                    System.out.println("ACCEPTED");
                }
                else
                {
                    System.out.println("CROP IT");
                }
            }
            else
            {
                System.out.println("UPLOAD ANOTHER");
            }
        }
    }
}