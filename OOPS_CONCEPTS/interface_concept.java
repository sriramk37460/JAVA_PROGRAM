package OOP;
interface vehicle{
    String s="printing";
    void ride();
    default void print(){
        System.out.println(s);
    }
}
class car implements vehicle{
    public void ride(){
        System.out.println("riding car");
    }
}
class bike implements vehicle{
    public void ride(){
        System.out.println("riding bike");
    }
}
class mechanic{
    void result(vehicle v){
        v.ride();
    }
}
public class interface_concept {
    public static void main(String[] args) {
        mechanic m=new mechanic();
        bike b=new bike();
        car c=new car();
        m.result(b);
        b.print();
        m.result(c);
    }
}
