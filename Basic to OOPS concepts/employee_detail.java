import java.util.*;
class Employee{
    String n;
    int a;
    long b;
    String c;
    Employee(String name,int year_of_joining,long salary,String address){
        n=name;
        a= year_of_joining;
        b=salary;
        c=address;
    }
    void display(){
        System.out.print(n+" "+a+" "+c);
    }}
 class mt4 {
     public static void main(String[] args){
         Employee num=new Employee("Robert",1994,20000,"64C-WallsStreat");
         Employee num1=new Employee("Sam",2000,20000,"68D-WallsStreat");
         Employee num2=new Employee("John",1999,20000,"26B-WallsStreat");
         num.display();
     }


}