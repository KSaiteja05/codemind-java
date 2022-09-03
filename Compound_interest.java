import java.util.*;
import java.lang.Math;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double p=s.nextInt();
        double r=s.nextInt();
        double t=s.nextInt();
        double ci=(1+r/100);
        double k=Math.pow(ci,t);
        k=k*p;
        System.out.printf("%.2f",k);
    }
}