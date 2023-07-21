import java.util.*;
class main{
  public static void main(String args[]){
    int arr[][]={{29,33,54},{86,85,68},{82,41,57}};
    int n=3;
    int b[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==0 && j==0){
          System.out.print(arr[i][j+1]%10+" ");
        }
        else if(i==0 && j==1){
          System.out.print(arr[i][j-1]%10+" ");
        }
        else if(i==0 && j==2){
          System.out.print(arr[i+1][j]%10+" ");
        }
        else if(i==1 && j==0){
          System.out.print(arr[i+1][j]%10+" ");
        }
        else if(i==1 && j==1){
          System.out.print(arr[1][1]%10+" ");
        }
        else if(i==1 && j==2){
          System.out.print(arr[i-1][j]%10+" ");
          
        }
        else if(i==2 && j==0){
          System.out.print(arr[i][j+1]%10+" ");
        }
        else if(i==2 && j==1){
          System.out.print(arr[i][j+1]%10+" ");
        }
        else if(i==2 && j==2){
          System.out.print(arr[i-1][j-2]%10+" ");
        }
      }System.out.println();
    }
    
  }
}