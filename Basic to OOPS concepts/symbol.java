import java.util.*;
public class symbol {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        char a[]=new char[n];
        char b[]=new char[n];
        for (int i = 0; i < n; i++) {
            a[i]=inp.next().charAt(0);
        }
        for (int i = 0; i < n; i++) {

            b[i]=inp.next().charAt(0);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
    }
}
