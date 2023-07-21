import java.util.*;

class main
{
    public static void main(String[] args)
    {
	  main m=new main();
	  sub b=new sub();
        int mynum1=b.plusmethod(8,5);
        double mynum2=b.plusmethod(4.3,6.26);
        System.out.println("Int:"+mynum1);
        System.out.println("Double:"+mynum2);
    }
}
class sub
{
	static int plusmethod(int x,int y)
    {
        return x+y;
    }
    static double plusmethod(double x,double y)
    {
        return x+y;
    }
}