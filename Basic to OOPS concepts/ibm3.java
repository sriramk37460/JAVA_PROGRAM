import java.util.*;
public class ibm3 {
    public static void main(String args[]){
        Scanner inp =new Scanner(System.in);
        int size= inp.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){


            arr[i]=inp.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0){
                System.out.println("not found");
            }
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                for(int k=j+1;k<size;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }
            }
        }
    }
}
