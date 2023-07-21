import java.util.*;
class arr{
   public static void main(String args[]){
   int[] a={1,2,3,4,5};
   int[] b={6,7,8,9,10};
   int n=a.length;
   int[] c=new int[n];
 int[] d=new int[n];
  System.out.println("array size " +n);
System.out.println();
System.out.printf("a array element is:");
   for(int i=0;i<a.length;i++)
{
   
   System.out.print(a[i]+",");}
 System.out.println();
System.out.println();
System.out.printf("b array element is:");
   for(int i=0;i<b.length;i++)
{
    System.out.print(b[i]+",");
}
 System.out.println();
System.out.println();
for(int i=n-1;i>=0;i--)
{
   d[i]=b[n-i-1];
   

}
System.out.printf("d (b reverse) element is:");
for(int i=0;i<n;i++)
{
    System.out.print(d[i]+",");
}
 System.out.println();
System.out.println();
System.out.printf("sum of a+reverse of b element is:");
for(int i=n-1;i>=0;i--)
{
   c[i]=b[i]+a[n-i-1];
   System.out.print(c[i]+",");}

}}