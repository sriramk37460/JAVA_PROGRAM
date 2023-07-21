import java.sql.SQLOutput;
import java.util.*;
public class lettcount {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
          String str= inp.next();
          char []arr= str.toCharArray();
          int c=0,count=0;
          for(int i=0;i<str.length();i++){
              c=0;
              count=1;
              for(int j=i+1;j<str.length();j++){
                  if((arr[i]==arr[j]) && c==0 && arr[i]!='0'){
                      arr[j]='0';
                      count++;
                  }
                  else{
                      c=1;
                  }
              }
              if(arr[i]!='0') {
                  System.out.print(arr[i] + "" + count);
              }
          }

    }
}
