//string swap
import java.util.*;
public class ex1 {

    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        String s= num.next();
        String goal=num.next();
        char temp;
        int flag;
        int count=0;
        int len=s.length();
        char a[]=s.toCharArray();;
        char b[]=goal.toCharArray();


        for(int i=0;i<len;i++){
           if(a[len-(i+1)]==b[i]){
               flag=0;
               count++;
           }
           else{
               flag=1;
               count++;
           }
           if(count==len){
               if(flag==0){
                   System.out.println("True");
               }
               else{
                   System.out.println("False");
               }
           }
        }

    }
}
