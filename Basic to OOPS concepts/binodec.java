import java.util.*;
import java.math.*;
public class binodec {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int a= inp.nextInt();
        int c,d=0,b=a;
        int count=0;
        while(b>0){
            c=b%10;
            b=b/10;
            count++;
        }
        int arr[]=new int[count];
        int i=0;
        while(a>0){
            c=a%10;
            arr[i]=c;
            a=a/10;
            i++;
        }

        for(int j=0;j<count;j++){
                arr[j]= (int) (arr[j]*(Math.pow(2,j)));
                d+=arr[j];
        }
        System.out.println(d);
    }
}
