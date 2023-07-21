import  java.util.*;
public class binary1 {
    public static void main(String args[]){
        int n=8;
        int count_of_zero=0;
        int count_of_one=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='1'){
                count_of_one++;
            }
            else{
                count_of_zero++;
            }
        }
        System.out.println("count_of_one " +count_of_one);
        System.out.println("count_of_zero "+count_of_zero);
    }
}
