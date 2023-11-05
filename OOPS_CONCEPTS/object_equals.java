package OOP;

//single inheritance

class employees {
    private  String Name;
    private double Salary;
    employees(String Name,double Salary){
        this.Name=Name;
        this.Salary=Salary;
    }
    void print(){
        System.out.println("hello");
    }
    String getName(){
        return Name;
    }
    double getSalary(){
        return Salary;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(obj==null){
            return false;
        }
        if(this.getClass()!=obj.getClass()){
            return false;
        }
        employees et=(employees) obj;
        return this.Name.equals(et.Name) && this.getSalary()==et.getSalary();
    }
    employees(){

    }
}
class Managers extends employees{
    double bonus;
    Managers(String Name, double Salary,double bonus) {

        super(Name,Salary);// if data is private then super keyword use to deligate value to the super class
        this.bonus=bonus;

    }
    void setBonus(double d){
        bonus=d;
    }
    double getBonus(){
        return bonus;
    }

}
public class object_equals {
    public static void main(String[] args) {
        employees e=new employees("raj",12000.0);
        System.out.println(e.getName()+" "+e.getSalary());
        employees e3=new Managers("ashok",34500.0,15500);
        System.out.println(e3.getName()+" "+e3.getSalary());
        employees e2=new employees("raj",12000.0);
        System.out.println(e.equals(e2));

    }
}
