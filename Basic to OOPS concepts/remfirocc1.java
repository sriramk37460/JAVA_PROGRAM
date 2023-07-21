import java.util.*;
public class remfirocc1 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = inp.next();
        String t=inp.next();
        int n1=0,n2=0,k=0;
        char pre=' ';
        char[] ch = s.toCharArray();
        char[] a=t.toCharArray();
        int arr[]=new int[20];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(ch[i]==a[j] && ch[i+1]==a[t.length()-1]){
                        ch[i]=' ';
                        ch[i+1]=' ';
                        break;
                }
            }
        }
          for(int i=0;i<arr.length;i++){
              if(arr[i]!=0){
                  System.out.println(arr[i]);
              }
          }
    }
}
