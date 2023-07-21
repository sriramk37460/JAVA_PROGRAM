import java.util.*;
public class simple1 {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int n=7;
        int a[]=new int[n];
        int b=-1;
        System.out.print("nums=");
        for(int i=0;i<n;i++){

            a[i]=num.nextInt();
        }
       // System.out.print("],");
        System.out.print("target=");
        int target=num.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==target) {
                System.out.print(i);
            }


           /* else {
                System.out.print("-1");
            }*/
        }

        System.out.print("-1");
    }
}
