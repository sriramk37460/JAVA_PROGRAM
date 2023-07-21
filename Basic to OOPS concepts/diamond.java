import java.util.*;
public class roc{
public static void main(String args[]){                    
       
         Scanner str=new Scanner(System.in);
         System.out.println("Enter the number:");                                
         int a=str.nextInt();
          
         for(int i=-a;i<=a;i++)
       { int l;
         if(i<0){
            l=-i;
           }
        else{
          l=i;
            }
            for(int s=0;s<l;s++){
              
               System.out.print(" ");    
              }
          for(int j=0;j<a-l;j++){
              
                System.out.print("* ");
              
          }System.out.println();
       
       }     
     }
}