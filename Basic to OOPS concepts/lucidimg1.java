import java.util.*;
import java.math.*;
public class lucidimg1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a=inp.nextInt();
        int b=0,d=0,e=0,f=1,g=0,c=0,n=0;
        while(c*c<a) {
            e = a - (c * c);
            d=c;
            c++;
        }
       // System.out.println(d+" "+e);
        int count=1,count2=0;


         gn:
        while(b<=e) {
            n=count;

            for(int i=0;i<count;i++) {
                f*=n;
                count2++;
            }
            b=f;
          // System.out.println(f);
           if(count2==count){
               f=1;
               count2=0;
           }
            count++;

            if(e==b) {
                g=1;
                break gn;
            }

        }

        if(g==1) {
            System.out.println("yes");
            System.out.println(d + " " + (count-1)+"^"+(count-1));
        }
        else{
            System.out.print("No");
        }

    }
}
