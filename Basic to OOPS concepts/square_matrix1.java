import java.util.*;
class sqmat1{
     public static void main(String[] args){
     
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size(n*n):");
     int n=sc.nextInt();
     int a[][]=new int[n][n];
     

     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             System.out.print("Enter the numbers:");
             a[i][j]=sc.nextInt();
             }}


    sample myobj=new sample();
   myobj.output(a,n);    

}
}    

class sample{
    void output(int a[][],int n){
       int b[][]=new int[n][n];

        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(j==0){
                   b[i][j]=a[i][j]+a[i][n-1];
                    System.out.print(b[i][j]+" ");              

           }
              else if(j==n-1){
                   b[i][j]=a[i][j]-a[i][0];
                   System.out.print(b[i][j]+" ");   

           }
            else{
              b[i][j]=a[i][j];
              System.out.print(b[i][j]+" ");   
           }
             }System.out.println();
}

}}