import java.util.*;
public class arraylist {

    public static void main(String args[]){
        ArrayList<Character> arr=new ArrayList<Character>();
        char j;
        int a=97;
        char ch=' ';
        for(int i=0;i<26;i++){
            ch= (char) (i+a);
            arr.add(ch);
          //  System.out.println(ch);
        }
       for(char s:arr){
            System.out.print(s+" ");
        }
       // System.out.println(arr);
        System.out.println("replaced before:"+arr.get(1));

        arr.set(1,'z');
        System.out.println("replaced after:"+arr.get(1));

        Iterator<Character> itr=arr.iterator();
        while(itr.hasNext()){//hasnext is used to while iterator if true
            j=itr.next();//it denotes next position
           if(j=='z'){
              itr.remove();//it denotes remove operation

            }
        }
        System.out.println(arr);

    }
}
