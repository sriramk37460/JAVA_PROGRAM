import java.util.*;
public class sortstrlen {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s= scan.nextLine();
        String temp=" ";
        String split[]=s.split(" ");
        for(int i=0;i< (split.length);i++) {
            if (i != (split.length) - 1)
                if (split[i].length() > split[i + 1].length()) {
                    temp = split[i];
                    split[i] = split[i + 1];
                    split[i + 1] = temp;
                }
        }
        for(int i=0;i< split.length;i++){
          System.out.print(split[i]+" ");
      }
    }
}
