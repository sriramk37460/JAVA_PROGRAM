//word game
import java.util.*;
public class game {
    int count,count1;
    String t;

    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        
        int n= inp.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=inp.next();
        }
        game g=new game();
        g.games(s,n);
    }
    void games(String s[],int n){
        String t1[]=new String[n];
        t1=s;
        continues:
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){


                if(s[i].length()!=n){
                    count++;

                }

            else if(s[i].length()==n){
                    count=0;
                    break continues;
                }

        }
        }
        for(int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {

                if (s[i].length() > s[j].length()) {
                    t = s[i];
                }
                else if(s[i].length() == s[j].length()){
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
                    t=s[j];
                }else {
                    t = s[j];
                }
            }
        }
        if(count!=0){
            System.out.println("Better luck next time");
        }
        else if(count==0) {
            System.out.println(t);
        }

    }

}
