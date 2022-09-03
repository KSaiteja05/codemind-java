import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float f=s.nextInt();
        float c=((f-32)*5)/9;
        System.out.printf("%.2f",c);
        
    }
}