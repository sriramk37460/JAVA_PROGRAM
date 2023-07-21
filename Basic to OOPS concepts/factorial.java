import java.sql.SQLOutput;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int a=1,b=1,count=0,c,d=0;
        while(a<=n){
            b*=a;
          /*  if(b%10==0){
                count++;
            }*/
            a++;
            d=b;
        }
        while(b>0){
            c=b%10;
            if(c==0){
                count++;
            }
            b=b/10;
        }
        System.out.println(d+" "+count);
    }
}
