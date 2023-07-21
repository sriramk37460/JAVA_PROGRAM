import java.util.*;
interface GTM{
    void jump();
    void bite();
}
interface SRI extends GTM {
    void jump();
}
abstract class monkey implements GTM,SRI{
    public abstract void jump();
    public abstract void bite();
}
class human extends monkey{
    public void jump(){
        System.out.println("Monkey is jumping one to another tree....");
    }
    public void bite(){
        System.out.println("Monkey is biting a potato chips....");
    }
}
public class classs2  {
    public static void main(String args[])
    {
        human h=new human();
        h.jump();
        h.bite();
    }

}
