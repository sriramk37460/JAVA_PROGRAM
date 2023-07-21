import java.util.*;
public class arraylist3 {
    public static void main(String args[]){
        ArrayList<Character> list=new ArrayList<Character>();
        list.add('a');
        list.add('b');
        ArrayList<Character> list1=new ArrayList<Character>();
        list1.add('c');
        list.addAll(list1);
    }
}
