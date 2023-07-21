import java.util.*;

class division{

public static void main(String[] args)
{
     Scanner num=new Scanner(System.in);
     System.out.printf("Enter a number: ");
     long N=num.nextLong();
     
     for(int i=1;i<=N;i++){
          if(N%i==0){
                System.out.print(i+" ");
             }       }
         }
}