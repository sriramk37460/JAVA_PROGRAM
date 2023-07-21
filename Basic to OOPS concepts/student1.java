import java.util.*;
class book{

  public static void main(String args[])
{
    Scanner objs=new Scanner(System.in);
    int a=objs.nextInt();
    
    System.out.println("value is :"+a);
    if(a%3==0){
       System.out.println("value "+a+" is divisble by 3");
       int sum=0;
       int i;
       for(i=0;i<3;i++)
			{
				sum=sum+a;
			}
			System.out.println(sum);
			if(sum<=9)
			{
				System.out.println(sum%1);
			}
			else if(sum>=10 && sum<=99)
			{
				System.out.println(sum%10);
			}
			else if(sum>=100 && sum<=99999)
			{
				System.out.printf("%02d",sum%100);
			}
 
     }
    else{
       System.out.println("value "+a+" is not divisble by 3");
   }
}}
