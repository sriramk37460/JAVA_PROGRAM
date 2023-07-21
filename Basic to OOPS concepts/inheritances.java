/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner num=new Scanner(System.in);
        int n,max,min,temp,temp1;
        n=num.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int s=0,t=0;
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=num.nextInt();
            b[i]=num.nextInt();

        }
        temp=max=c[0];
        for(int i=0;i<n;i++){
            s=s+a[i];
            a[i]=s;
            t=t+b[i];
            b[i]=t;
            if(a[i]>b[i]){
                c[i]=a[i]-b[i];
            }
            else if(a[i]<b[i]){
                c[i]=b[i]-a[i];
            }
            if(c[i]<max){
                max=max;
                if(c[i]<temp) {
                    min = c[i];
                    temp = min;
                }
                else if(c[i]>temp){
                    min=temp;
                    temp=temp;
                }
            }
            else if(c[i]>max){
                min=max;
                max=c[i];
            }
        }

    }
}
