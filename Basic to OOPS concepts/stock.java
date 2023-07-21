import java.util.*;
public class stock {

    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= inp.nextInt();
        int a[]=new int[n];
        int c[]=new int[n-3];
        int b=0;
        System.out.println("enter the stock price:");
        for(int i=0;i<n;i++){
            a[i]=inp.nextInt();
        }
        for(int j=0;j<n-3;j++) {
            for (int i = 0; i < n; i++) {
                if (i < n - 3) {
                    c[j] = a[(2 * (i+1)) + 1];
                }
                System.out.print(c[j]);

            }

        }
       /* for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){

                if(((2*(i+1))+1)<=(n-1)){
                    c[j]=a[(2*(i+1))+1];
             if(a[i]!=c[j]){
           if(a[i]<a[i+2]){
               b=0+b;
               System.out.print("the value is"+b);
           } else if (a[i]>a[i+2]) {
               b=b+(a[i]-a[i+2]);
               System.out.print("the value is"+b);
           }}}}

        }
     //   System.out.print("the value is"+b);*/
    }
}
