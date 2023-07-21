import java.util.*;
 class det{

     public static void main(String args[]){
       
         Scanner str=new Scanner(System.in);
        System.out.println("Enter the number:");
         int a=str.nextInt();

         //System.out.println("Enter the string:");
         //String a=str.nextLine();
         //int len=a.length();
         
         //if(len%2==0){

         for(int i=1;i<=a;i++){
             for(int k=1;k<=a-i+1;k++){
                    System.out.print(" ");
               }
            // for(int l=k+1;l<=i;l++){
             //System.out.print(" ");}}
            for(int j=1;j<=i;j++){
                    
                    System.out.print(i+" ");
                  
                   }
                  System.out.println();
              }}
            }