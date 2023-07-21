import java.util.*;
public class binaryflip {
    public static void main(String args[]){
        int n=8;
        int n1=4;
        int count_of_one=0,count_of_zero=0;
        String n3=Integer.toBinaryString(n^n1);

        System.out.println(n3);
        for(int i=0;i<n3.length();i++){
            char c=n3.charAt(i);
            if(c=='1'){
                count_of_one++;
            }
            else{
                count_of_zero++;
            }
        }
        System.out.println("count_of_one " +count_of_one);
    }
}
