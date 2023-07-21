import java.util.*;
 public class det{

     public static void main(String args[]){
       
         Scanner str=new Scanner(System.in);
        // System.out.println("Enter the number:");                                
         //int a=str.nextInt();

         System.out.println("Enter the string:");
         String a=str.nextLine();
         int len=a.length();
         String[] strs=a.split("");
         if(len%2==0){

         for(int i=1;i<=len;i++){
             for(int k=1;k<=len-i+1+(len/2);k++){
                    System.out.print(" ");
               }
            // for(int l=k+1;l<=i;l++){
             //System.out.print(" ");}}
            for(int j=1;j<=i;j++){
                    
                    System.out.print("* ");
                  
                   }
                  System.out.println();
              }
            
             for(int i=1;i<=len/2;i++){
             for(int k=1;k<2;k++){
                    System.out.print("*");
               }}
               for(int g=0;g<len;g++){
            System.out.printf(" %s",strs[g]);}
            for(int i=1;i<=len/2;i++){
             for(int k=1;k<2;k++){
                    System.out.print("*");
               }}}
         else{

         for(int i=1;i<=len;i++){
             for(int k=1;k<=len-i+1+(len/2);k++){
                    System.out.print(" ");
               }
            // for(int l=k+1;l<=i;l++){
             //System.out.print(" ");}}
            for(int j=1;j<=i;j++){
                    
                    System.out.print("* ");
                  
                   }
                  System.out.println();
              }}
            
             for(int i=1;i<=len/2;i++){
             for(int k=1;k<2;k++){
                    System.out.print("*");
               }}
               for(int g=0;g<len;g++){
            System.out.printf(" %s",strs[g]);}
            System.out.print(" ");
            for(int i=1;i<=len/2;i++){
             for(int k=1;k<2;k++){
                    System.out.print("*");
               }} System.out.println();
               
               for(int i=0;i<1;i++)
               {   for(int k=0;k<=len/2;k++){
                   System.out.print(" ");
               }
                   for(int j=0;j<len;j++){
                       System.out.print("* ");
                   }
               }
     }}