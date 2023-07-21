import java.util.*;
public class gcd {
   int gcd(int a,int b){
       int m,n,d=0;
          if(a>b){
              m=a;
              n=b;}
              else{
              m=b;
              n=a;}

          if(n!=0)
              return gcd(n,m%n);

           else
               return m;
   }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        gcd in=new gcd();
        int a= inp.nextInt();
        int b= inp.nextInt();
        int d=in.gcd(a,b);
        System.out.println(d);
    }
}
