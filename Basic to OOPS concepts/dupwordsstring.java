import java.util.*;
public class dupwordsstring {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0 ; //bring back ball break back ball
        String t[] = new String[s.length()];
        int t1[]=new int[s.length()];
        String split[] = s.split(" ");
        for (int i = 0; i < (split.length)-1; i++) {
            for (int j = i+1; j < split.length; j++) {
               if(split[i].equals(split[j]))
                {
                   split[j]="null";
                   count++;
                }
            }

            t[i]=split[i];
            t1[i]=count+1;
            count = 0;
        }

        for (int i = 0; i < split.length; i++) {

          if(t1[i]>1&& t[i]!="null"){
                System.out.println(t[i]+" "+t1[i]);
        }}
        }
    }

