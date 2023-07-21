import java.util.*;
public class fingercount {
    public static void main(String args[]){
        String arr[]={"thumb","index","middle","ring","little"};
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= input.nextInt();
        int a,b,c,d;
        a=num-5;
        b=a/4;
        c=a-(b*4);

        if(b%2==0){
            d=4-c;
        }
        else{
            d=0+c;
        }
        System.out.println("result is:"+arr[d]);
    }
}
