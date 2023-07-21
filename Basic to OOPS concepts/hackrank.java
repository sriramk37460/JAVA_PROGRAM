import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=LONG.MIN VALUE && x<=LONG.MAX VALUE ) { 
                if(x>=INTEGER.MIN VALUE && x<=INTEGER.MAX VALUE) {
                if(x>=SHORT.MIN VALUE && x<=SHORT.MAX VALUE) {
                if(x>=BYTE.MIN VALUE && x<=BYTE.MAX VALUE){
                    System.out.println("* byte");}
                    System.out.println("* short");}
                    System.out.println("* int");}
                    System.out.println("* long");}
               
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


