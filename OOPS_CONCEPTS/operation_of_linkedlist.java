package OOP;



public class operation_of_linkedlist {
    public static void main(String[] args) {
        Linked_list l=new Linked_list();
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(5);
        l.insertLast(6);
        l.insertMiddle(4,3);
        l.display();
        System.out.println(l.deleteFirst());
        System.out.println(l.deleteLast());
        System.out.println(l.deleteMiddle(2));
        l.display();
        l.getnode=l.find(5);
        try{
            int val = l.getnode.val;
            System.out.println(val);
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }


    }
}