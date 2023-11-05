package OOP;

public class stack_inbulid_1 {
    private int a[]=new int[5];
    private int top;
    stack_inbulid_1(){
        top=-1;
    }
    void push(int ele){
        if(top==4){
            System.out.println("overflow");
        }
        else{
            top=top+1;
            a[top]=ele;

        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Popped element is: "+a[top--]);
        }
    }
    void peek(){
       // int elem=a[top];
  ;      System.out.print("Peek element is:"+a[top]);

    }
    void display(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Stack elemet is:");
            for(int i=top;i>=0;i--){
                System.out.println(a[i]);
            }
        }
    }
}


