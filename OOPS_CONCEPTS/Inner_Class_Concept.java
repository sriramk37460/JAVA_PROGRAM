package OOP;
class outer{
    private int num;
    int outer_val(int a){
     num=a;
     return num;
    }
    class inner{
        inner(){
            System.out.println("Inner class without static");
        }
    }
    static class inner1{
        void inner1(){
            System.out.println("Inner class with static");
        }
    }
}
public class Inner_Class_Concept {
    public static void main(String[] args) {
        outer o=new outer();
        System.out.println(o.outer_val(10));
        outer.inner i=o.new inner();
        outer.inner1 i1=new outer.inner1();
        i1.inner1();
    }
}
