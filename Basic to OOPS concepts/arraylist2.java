import java.util.*;
class Student{
    int roll_no;
    String name;
    int age;
    Student(int rollno,String names,int ag){
        roll_no=rollno;
        name=names;
        age=age;
    }
}

public class arraylist2{
    public static void main(String args[]){
        //Creating user-defined class objects
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.roll_no+" "+st.name+" "+st.age);
        }
    }
}
