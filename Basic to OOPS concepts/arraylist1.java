import java.util.*;
public class arraylist1 {
    public static void main(String args[]){
        ArrayList<Character> list=new ArrayList<Character>();
        int a=97;
        char b=' ';
        for(int i=0;i<26;i++){
            b=(char)(a+i);
            list.add(b);
        }
        //using list iterator and list size to print reverse alphabet
        ListIterator<Character> list1=list.listIterator(list.size());
        while(list1.hasPrevious()){
            char c=list1.previous();
            System.out.print(c +" ");
        } System.out.print("\n");
        //using list iterator and list size to print alphabet
        ListIterator<Character> list2=list.listIterator(0);
        while(list2.hasNext()){
            char c=list2.next();
            System.out.print(c +" ");
        } System.out.print("\n");
        //using normal loop to print alphabet
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }System.out.print("\n");
        //using for each loop to print alphabet
        list.forEach(d->
                {
              System.out.print(d+" ");
                }
                );
    System.out.print("\n");
    //using iterator and for each remaining loop to print  alphabet
    Iterator<Character> itr=list.iterator();
    itr.forEachRemaining(d->{
        System.out.print(d+" ");
    });
}
}
