import java.util.Scanner;

public class arraysplit {
   public static void main(String args[]){
       Scanner inp=new Scanner(System.in);
       System.out.print("Enter the size:");
       int n=inp.nextInt();
       int arr1[]=new int[n];
       int div;
       for(int i=0;i<n;i++){
           System.out.print("Enter the data:");
           arr1[i]=inp.nextInt();
       }
       System.out.print("Enter the new size:");
       div= inp.nextInt();
       int n1,n2=0;
       if(n%div==0){
           n2=n;
       }
       else{
           n1=n/div;
           n2=n1+(n%div);
       }
       int arr3[]=new int[n2];
       for(int i=0;i<n2;i++){
           if(i<n) {
               arr3[i] = arr1[i];
           }
           else{
               arr3[i]=0;
           }
       }

     int l,k=0;
       for(int i=0;i<n2;i+=div){


           System.out.print("[");

           for(int j=i;j<div+i;j++){

             System.out.print(arr3[j]);

             if(div>1){
                 System.out.print(",");
             }
         }

           System.out.print("],");


       }
   }
}
