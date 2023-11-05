package OOP;

public class Linked_list {

    private Node head;
    private  Node tail;
    private static int size;

    public Node getnode;
    public Linked_list(){
        this.size=0;
    }

    public void insertFirst(int val){

        Node new1=new Node(val);
        new1.next=head;
        head=new1;
        if(tail==null){
            tail=head;
        }
        size+=1;
       // display();
    }
    public void insertMiddle(int val,int index){
        if(index==0) {
            insertFirst(val);
            return;
        }
        if(index==size) {
            insertLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node new1=new Node(val,temp.next);
        temp.next=new1;
        size+=1;
     //   display();
    }
    public void insertLast(int val){
        Node new1=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=new1;
        tail=new1;
        size+=1;
        //display();
    }
    public int deleteFirst(){
        if(head==null){
            System.out.println("list is empty");

        }
        int delete=head.val;

       // System.out.println("Deleted element is "+head.val);
        head=head.next;
        if(head==null){
            tail=null;

        }
        size-=1;
        return delete;
    }
    public int deleteMiddle(int index){
        int delete=0;
        if(head==null){
            System.out.println("list is empty");
        }
        if(head==tail){
            delete=deleteFirst();
            return delete;
        }
        Node temp=head,temp1=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
            temp1=temp.next;
        }
        temp.next=temp1.next;
        delete=temp1.val;
        temp1.next=null;
        size-=1;
        return delete;
    }
    public int deleteLast(){
        int delete=0;
        if(head==null){
            System.out.println("list is empty");
        }
        if(head==tail){
            delete=deleteFirst();
            return delete;
        }
        Node temp=head;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        delete=temp.next.val;
        tail=temp;
        tail.next=null;

        size-=1;
        return delete;
    }
    public Node find(int val){
        Node node=head;
        while (node!=null){
            if(node.val==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void display(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }

        System.out.println("End");
    }
    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
//        Node(){
//
//        }
    }
}
