import java.util.*;

public class handshake {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num=input.nextInt();
        int i = 0;
        while(num>0) {
            i+=num-1;
            num--;
        }
        System.out.println("total is:"+i);
    }
}
