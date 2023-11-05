package OOP;

public class doubly_LinkedList {
    private Node head;
    private Node tail;
    private  static int size;
    public Node getnode;
    public doubly_LinkedList(){
        this.size=0;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;

        if(head!=null){
            head.prev=node;
        }
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;

    }
    public void insertMiddle(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size-1){
            insertLast(val);
            return;
        }
        Node temp=head,temp1=head;
        for(int i=1;i<index;i++){
           temp=temp.next;
           temp1=temp.next;
        }
        Node node=new Node(temp,val,temp1);
        temp.next=node;
        temp1.prev=node;
    }
    public void insertLast(int val){
        Node node=new Node(val);
        if(head==null){
            insertFirst(val);
            return;
        }
        tail.next=node;
        node.prev=tail;
        node.next=null;
        tail=node;
        size+=1;
    }
    public int deleteFirst(){
        Node temp=head;
        head=head.next;
        head.prev=null;
        size-=1;
        return temp.val;

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
        doubly_LinkedList.Node temp=head,temp1=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
            temp1=temp.next;
        }
        temp.next=temp1.next;
        delete=temp1.val;
        temp1.next.prev=temp;
        temp1.next=null;
        size-=1;
        return delete;
    }
    public int deleteLast(){
      Node temp=tail;
        if(head==null){
            System.out.println("list is empty");
        }

      tail=tail.prev;
      tail.next=null;
      size-=1;
      return temp.val;
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
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void displayReverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.prev;
        }
        System.out.println("START");
    }
    private class Node{
        Node prev;
        int val;
        Node next;
        public Node(int val){
           this.val=val;
        }
        public Node(Node prev,int val,Node next){
            this.prev=prev;
            this.val=val;
            this.next=next;
        }
    }
    public static void main(String args[]){
        doubly_LinkedList l=new doubly_LinkedList();
        l.insertFirst(3);
        l.insertFirst(2);
        l.insertFirst(1);
        l.insertLast(5);
        l.insertLast(6);
        l.insertMiddle(4,3);
        l.display();
        l.displayReverse();
        System.out.println(l.deleteMiddle(2)+" "+l.deleteFirst()+" "+l.deleteLast());
        l.display();
        l.displayReverse();
        l.getnode=l.find(6);
        try{
            int val = l.getnode.val;
            System.out.println(val);
        }
        catch (NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
    }
}
