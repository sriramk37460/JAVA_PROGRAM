import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner num=new Scanner(System.in);
       int n=num.nextInt();
      mat(n);
    }
    static int mat(int n){
                Scanner num1=new Scanner(System.in);

      int[][] arr1=new int[n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.println("enter the elrment");
              arr1[i][j]=num1.nextInt();
          }
      }
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(arr1[i][j]+" ");
          }System.out.println();
      }
    }
}

