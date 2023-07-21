import java.sql.SQLOutput;
import java.util.*;
public class stepjump {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size:");
        int n=input.nextInt();
        int a;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the number:");
            arr[i]=input.nextInt();
        if(arr[i]%2==0){
            a=arr[i]/2;
        }
        else{
            a=(arr[i]/2)+1;
        }

        System.out.println("result is:"+a);
    }}
}
