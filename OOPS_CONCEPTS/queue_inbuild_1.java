package OOP;

public class queue_inbuild_1 {
    private int a[]=new int[5];
    private int front,rear;
    queue_inbuild_1(){
        front=-1;
        rear=-1;
    }
    void enqueue(int ele){
        if(rear==4){
            System.out.println("Queue full");
        }
        else if(rear==-1){
            front++;
            rear++;
            a[rear]=ele;
        }
        else{
            rear++;
            a[rear]=ele;
        }
    }
    void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue empty");
        }
        else if(front==rear){
            System.out.println("removing element is:"+a[front++]);
            front=-1;
            rear=-1;
        }
        else{
            System.out.println("removing element is:"+a[front++]);
        }
    }
    void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue empty");
        }
        else{
            System.out.println("Queue element is:");
            for(int i=front;i<=rear;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
}
