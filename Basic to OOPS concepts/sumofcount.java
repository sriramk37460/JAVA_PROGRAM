import java.sql.SQLOutput;
import java.util.*;
public class sumofcount {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size:");

        int size= input.nextInt();
        int target, a,b,count=0;
        int arr[]=new int[size];
        System.out.println("enter the number:");

        for(int i=0;i<size;i++){


            arr[i]=input.nextInt();
        }
        System.out.println("enter the target:");

        target=input.nextInt();
        for (int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(target==arr[i]+arr[j]){
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                    count=1;
                }
            }
        }
        if(count==0){
            System.out.print("No 2 values sum upto "+target);
        }
    }
}
