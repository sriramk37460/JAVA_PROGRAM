package OOP;

class father1{
    void f(){
        System.out.print("vivek is a father of ");
    }
}
class son1 extends father1{
    void s(){
        System.out.println("raju(son)");
    }
}
class daughter1 extends father1{
    void d(){
        System.out.println("jaanu(daughter)");
    }
}
public class hierarchical_inheritance {
    public static void main(String[] args) {
        daughter1 d=new daughter1();
        son1 s=new son1();
        d.f();
        d.d();
        s.f();
        s.s();
    }
}
