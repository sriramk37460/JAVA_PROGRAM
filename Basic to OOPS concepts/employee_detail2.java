import java.util.Scanner;

class employee{
    void detail(){
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=str.nextLine();
        System.out.println("Enter the id:");
        String id=str.nextLine();
        System.out.println("Enter the phone no:");
        Long number= str.nextLong();
        System.out.println("Enter the age:");
        int age= str.nextInt();
        System.out.println("Enter the address:");
        String address=str.next();

        System.out.println("*************Employee details************");
        System.out.print(" Name :"+name+"\n Emp id:"+id+"\n Phno:"+number+"\n Age:"+age+"\n Address:"+address);
    }
}
 class employeedet {
    public static void main(String[] args){
        employee emp=new employee();
        emp.detail();
    }
}