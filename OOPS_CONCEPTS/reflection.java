package OOP;
import java.util.*;
import java.lang.reflect.*;
public class reflection {
    public static void main(String[] args) {
        employees e=new employees("raj",123000.0);
        employees e1=new employees("raj",123000.0);
        Class c=e.getClass();
        System.out.println(c.getName());
        Method[] methods=c.getMethods();
        for (Method m:
            methods ) {
            System.out.println(m.getName() );
        }
        try {
            System.out.println(methods[0].invoke(e,e1));
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
    }
}
