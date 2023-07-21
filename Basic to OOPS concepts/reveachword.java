import java.util.*;
public class reveachword {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter the string:");
        String s=inp.nextLine();
        int k=0;
        String t[]=s.split(" ");
        for(int i=0;i<t.length;i++){
            char arr[]=t[i].toCharArray();
            char arr1[]=new char[t[i].length()];
            for(int j=0;j<arr.length;j++){
                arr1[(t[i].length()-1)-j]=arr[j];
            }
            for(int j=0;j<arr.length;j++){
                System.out.print(arr1[j]);
            }
            System.out.print(" ");

        }
    }
}
