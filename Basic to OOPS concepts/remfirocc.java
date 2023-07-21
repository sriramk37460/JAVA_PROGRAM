
import java.util.*;
public class remfirocc {                   //aka.ms/studentcertification
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = inp.nextLine();
        char[] ch=s.toCharArray();
        int k=0,count=0,flag=1,len=s.length();
        char[] a=new char[s.length()];
       // place:
        for(int i=0;i<s.length();i++) {

       // flag=1;
        //    for(int l=0;l<=count;l++)
          //      if(ch[i]==a[l]){
            //       flag=0;

              //  }
            //else
                if((i>0 && ch[i]!=a[k]&& flag!=0)||i==0)
            for(int j=i+1;j<s.length();j++){
              //  if(ch[len-2]==ch[len-1]){

               // }
                if(ch[i]==ch[j] ){
                    //++k;
                    count++;
                    a[++k]=ch[i];
                    ch[i]=' ';

                    break;
                }
            }
        }
        for(int i=0;i<s.length();i++){
            System.out.print(ch[i]/*+" "+a[k]*/);
        }
    }
}
