import java.util.*;
public class basket {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the size:");
        int n=inp.nextInt();
        int total=0,total1=0;
        int sub,result;

        int arr1[]=new int[n];
        int arr2[]=new int[n];


        for(int i=0;i<n;i++) {
            System.out.print("Enter the data for first array:");
            arr1[i] = inp.nextInt();
            total += arr1[i];
        }

        for(int i=0;i<n;i++){
            System.out.print("Enter the data for second array:");
            arr2[i]=inp.nextInt();
            total1+=arr2[i];
        }
        if(total==total1){
            result=total-total1;
        }
        else if(total>total1){
            sub=(total-total1)/2;
            if((total-sub)==(total1+sub)){
                result=sub;
            }
            else{
                result=-1;
            }
        }
        else{
            sub=(total1-total)/2;
            if((total+sub)==(total1-sub)){
                result=sub;
            }
            else{
                result=-1;
            }
        }
        System.out.println(result);

    }
}
/*
Example 1:
Input: basket1 = [4,2,2,2], basket2 = [1,4,1,2]
Output: 1
Example 2:
Input: basket1 = [2,3,4,1], basket2 = [3,2,5,1]
Output: -1

 */