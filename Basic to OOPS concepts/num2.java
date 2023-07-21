import java.util.*;

class intger{
   public static void main(String args[]){
   Scanner myObj=new Scanner(System.in);
   int a=myObj.nextInt();
   int i;
   System.out.printf("the value is :%d",a);
  if(a%3!=0){
   
System.out.println(" is not divisible by 3");  
}
 else{
     System.out.println(" is divisible by 3");
   
     for(i=1;i<=a;i++)
     {
       a=i+a;
      } 
  }
   System.out.println("the value is :"+a);
}}