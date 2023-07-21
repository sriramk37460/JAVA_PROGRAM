import java.util.*;
public class symbolfind {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int count=0;
        String str=inp.next();
        for(char i:str.toCharArray()){
            if((i>=(char)(48) && i<=(char)(57))||((i>=(char)(65) && i<=(char)(90))||(i>=(char)(97) && i<=(char)(122))))
            {

            }
            else{
                count++;
            }

        }
        System.out.println(count);
    }
}
