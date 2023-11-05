package OOP;
class grand_father{
    void gf(){
        System.out.println("Grand Father");
    }
}
class father extends grand_father{
    void f(){
        System.out.println("Father");
    }
}
class son extends father{
    void s(){
        System.out.println("Son");
    }


}
public class multi_level_inheritance {
    public static void main(String[] args) {
        son s=new son();

        s.gf();
        s.f();
        s.s();

    }
}
