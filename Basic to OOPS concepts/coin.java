import java.util.*;

class coin{

public static void main(String[] args)
{
     Scanner num=new Scanner(System.in);
     System.out.printf("Enter a number: ");
     int N=num.nextInt();
     
      if(N>4){
            int k=N/5;
            int i=(N/5)-(k-1);
           int a=N-(i*5);
           if(a>5){
          
             
                if(a%2==0){
                            
                  int b=2;
                  int j=a/2-1;
                  System.out.print((i+j+b)+" "+i+" "+j+" "+b);
                }
              else{
                            
                  int b=1;
                  int j=a/2;
                  System.out.print((i+j+b)+" "+i+" "+j+" "+b);
                }}
         else{
             int b=a-(a/2)*2;
                  int j=a/2;
                  System.out.print((i+j+b)+" "+i+" "+j+" "+b);
       
             }}
   else{
    int m=N/2;
       if(m==N/2){
                  int i=0;
                  int b=N-(N/2)*2;
                  int j=N/2;
                  System.out.print((i+j+b)+" "+i+" "+j+" "+b);
}}

         }
}