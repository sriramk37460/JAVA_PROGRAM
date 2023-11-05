package OOP;
interface vehicle1{
    String s="printing";
    void ride();
    default void print(){
        System.out.println(s);
    }
}
class car1 implements vehicle1{
    public void ride(){
        System.out.println("riding car");
    }
}
class bike1 implements vehicle1{
    public void ride(){
        System.out.println("riding bike");
    }
}
class mechanic1{
    void result(vehicle v){
        v.ride();
    }
}
public class lamda_expression {
    public static void main(String[] args) {
        vehicle1 v=() -> System.out.println("riding cycle");
        v.ride();
        }
    }

