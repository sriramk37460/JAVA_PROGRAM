package OOP;
//single inheritance

class employee {
   private  String Name;
   private double Salary;
    employee(String Name,double Salary){
        this.Name=Name;
        this.Salary=Salary;
    }
    String getName(){
        return Name;
    }
    double getSalary(){
        return Salary;
    }
    void setName(String n){
        Name=n;
    }
    double setSalary(double s){
        Salary=s;
        return s;
    }
    double raise_salary(int percent){
        Salary+=Salary*percent/100;
        return Salary;
    }
    employee(){

    }
}
class Manager extends employee{
    double bonus;
    Manager(String Name, double Salary,double bonus) {
      /*  this.Name=Name;
        this.Salary=Salary;
        this.bonus=bonus;
        // its work when data is not private
       */
        super(Name,Salary);// if data is private then super keyword use to deligate value to the super class
        this.bonus=bonus;

    }
    void setBonus(double d){
        bonus=d;
    }
    double getBonus(){
        return bonus;
    }
    double getSalary(){
        double s=super.setSalary(super.getSalary()+bonus);
        return s;
    }
}
public class inheritance {
    public static void main(String[] args) {
        employee e=new employee("raj",12000.0);

        System.out.println(e.getName()+" "+e.getSalary());
        System.out.println("Raise salary "+e.raise_salary(10));
        e.setName("jaanu");
        e.setSalary(13000.0);
        System.out.println(e.getName()+" "+e.getSalary());
        System.out.println("Raise salary "+e.raise_salary(50));


        Manager m=new Manager("Raju",40000.0,5000);
     //   double salary=m.getSalary()+m.getBonus();
     //   System.out.println(m.getName()+" "+(salary));
      //  m.setSalary(salary);
        System.out.println(m.getName()+" "+m.getSalary());
          System.out.println("Raise salary "+m.raise_salary(10));



          employee e3=new Manager("ashok",34500.0,15500);//it is posiible(super obj=new base)
        // Manager m3=new employee("raja",12300.0);// it is not possible
        System.out.println(e3.getName()+" "+e3.getSalary());
        employee e4[]=new employee[2];
        e4[0]=new employee("rajan",12300.0);
        e4[1]=m;//set a manager values to employee .but manager unique values not changeable in employee
        Manager m4;
        if(e4[0] instanceof Manager){
            m4=(Manager)e4[0];//not working e4[0] not instance of manager
        }
    }
}
