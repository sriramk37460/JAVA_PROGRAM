import java.util.*;
class employee1 implements Comparable<employee1>{
    private String name;
    private double salary;

    public employee1(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
    public int compareTo(employee1 e){
        if(salary==e.salary)
            return 0;
        if(salary<e.salary)
            return -1;
        return 1;
    }
}
public class obj_sort {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        employee1[] emp=new employee1[4];
        for (int i = 0; i < 4 ; i++) {
           emp[i]= new employee1(inp.next(),inp.nextInt());
        }
        System.out.println("Before");
        for (int i = 0; i < 4; i++) {
            System.out.println(emp[i].getName()+" "+emp[i].getSalary());
        }
        Arrays.sort(emp);
        System.out.println("After");
        for (int i = 0; i < 4; i++) {
            System.out.println(emp[i].getName()+" "+emp[i].getSalary());
        }
    }
}
/*
a 4
b 1
c 3
d 2
 */