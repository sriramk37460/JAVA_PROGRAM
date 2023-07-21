import java.util.*;
public class camelcase {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);

       char arr2[]=inp.nextLine().toCharArray();
       int n,len=arr2.length;

        for(int i=0;i< len;i++){

                if(i==0){
                   n=(int)arr2[i];
                   arr2[i]=(char)n;

                }
                if(arr2[i]==' ') {
                    n=(int)arr2[i+1];
                    arr2[i+1]=(char)n;
                }
                System.out.print(arr2[i]);
            }
           // System.out.print(" "+len);
        }
    }

