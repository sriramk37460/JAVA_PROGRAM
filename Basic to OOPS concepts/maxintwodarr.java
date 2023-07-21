import java.util.*;
public class maxintwodarr {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int arr[][]=new int[n][n];
        int arr1[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            temp=0;
            for(int j=0;j<n;j++){
                arr[i][j]= inp.nextInt();
                if(arr[i][j]>0) {
                    temp += arr[i][j];
                }
            }
            arr1[i]=temp;
        }
        temp=arr1[0];
        for(int i=1;i<n;i++){
            if(temp<arr1[i]){
                temp=arr1[i];
            }
        }
        System.out.print(temp);
    }
}
