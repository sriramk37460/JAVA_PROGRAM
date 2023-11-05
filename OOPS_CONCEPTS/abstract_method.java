package OOP;
abstract class Member{
    private String name;
    abstract void welcome();
    protected void hello(){//it only use in derived class
        System.out.println("nothing");
    }
}
class Teacher extends Member{
    void welcome(){
        System.out.println("Welcome Teacher");
    }
}
class Student extends Member{
    void welcome(){
        System.out.println("Welcome Student");
    }
}
public class abstract_method {
    public static void main(String[] args) {
     Teacher t=new Teacher();
     Student s=new Student();
     //Member m=new Member();//its not possible for abstract class
     //it is possible
      Member m1=new Teacher();
      Member m2=new Student();

      Member m3[]=new Member[4];
      m3[0]=new Student();
      m3[1]=new Teacher();
      m3[2]=new Teacher();
      m3[3]=new Student();

        for (Member m5:
             m3) {
            m5.welcome();
        }

        m1.hello();
        t.hello();
        s.hello();
    }
}
