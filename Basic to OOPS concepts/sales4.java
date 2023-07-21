import java.util.*;
public class sales4 {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int a[]=new int[n];
        int k= inp.nextInt();
        int count=-1,d=0;
        for (int i = 0; i < n; i++) {
           a[i]=inp.nextInt();
        }
        for(int i=0;i<n;i++){
            count++;
            if(count==k){
               d+= (a[i]-a[i-1]);
               count=0;
            }
        }
        System.out.println(d);
    }
}
