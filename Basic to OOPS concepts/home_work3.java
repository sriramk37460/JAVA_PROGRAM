import java.util.*;
public class simple4 {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int N=num.nextInt();
        int Q=num.nextInt();
        int sum=0;
        int prd=1;
        for(int i=1;i<=N;i++){
            if(Q==1) {
                sum += i;

            }

            else if(Q==2){
                prd*=i;

            }
        }

            if(Q==1) {
                //sum += i;
                System.out.println(sum);
            }

            else if(Q==2){
                //prd*=i;
                System.out.println(prd);
            }

       // System.out.println(sum);
    }
}