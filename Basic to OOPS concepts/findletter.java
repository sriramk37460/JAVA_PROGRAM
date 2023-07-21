import java.util.Scanner;

public class findletter {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        char letter=inp.next().charAt(0);
        char []arr= str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(arr[i]==letter){
                count++;
            }
        }
        System.out.println(letter+" "+count);
    }
}
