import java.util.*;

class commerce{

public static void main(String[] args)
{
     Scanner num=new Scanner(System.in);
     System.out.printf("Enter a number: ");
     int N=num.nextInt();
     int pro=0;
     for(int i=1;i<N-1;i++){
         
         pro+=i;
       }
System.out.println(pro);
}}