
import java.util.*;
public class simple5 {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int t=num.nextInt();

        while (t>0){
            String a=num.next();
            String b=num.next();
            char[] an=new char[a.length()];
            char[] bn=new char[a.length()];
            int count=0;
            //an=String.split("");
           // bn=b.split("");
          //  int n=an.length();
            for(int i=0;i<a.length();i++){
                an[i]=a.charAt(i);
                bn[i]=b.charAt(i);

            }
            for(int i=0;i<a.length();i++){
                if(an[i]!=(bn[i])){
                        count++;
                }
                else{
                    //count=0;
                }

            }
            System.out.println(count);
        }
    }

}