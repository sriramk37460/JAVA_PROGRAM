import java.util.*;

       abstract class parent{
          abstract void a_method();
          void a1_method(){
              System.out.println("this is normal method of abstract class");
          }
        }
        class subclass extends parent{
         void a_method(){
             System.out.println("This is abstract method");
         }
         subclass(){
             System.out.println("this is a constructor of abstract class");
         }
        /* void a1_method(){
             System.out.println("this is normal method of abstract class");
         }*/
        }
       public class classs1 {
           public static void main(String args[]){
               subclass s=new subclass();
               s.a_method();
               s.a1_method();
     }
}
