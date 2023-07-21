class grand_parent{
    String name;
    void gp_name(){
        name="guhan";
        System.out.println("grandparent name:"+name);

    }
}
class parents extends grand_parent{
    String name;
    void p_name(){
        name="lakshmi narayanan";
        System.out.println("parent name:"+name);
       // gp_name();
    }
}
class child extends parents{
  String name;
    void c_name(){
        gp_name();
        p_name();

        name="adhithya";
        System.out.println("child name:"+name);

    }
}
public class multilevelinheritance {
    public static void main(String args[]){
        child c=new child();
        //c.gp_name();
       // c.p_name();
        c.c_name();
        System.out.print(c.name);

    }
}
