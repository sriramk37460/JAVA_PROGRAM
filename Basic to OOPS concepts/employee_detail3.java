import java.util.Scanner;

class employee1{
    void detail(int n){

        Scanner str=new Scanner(System.in);
        String[] name=new String[n];
        String[] id=new String[n];
        Long[] number=new Long[n];
        String[] address=new String[n];
        int[] age=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("*******employee**********");
            System.out.println("Enter the name:");
            name[i] = str.next();
            System.out.println("Enter the id:");
            id[i] = str.next();
            System.out.println("Enter the phone no:");
            number[i] = str.nextLong();
            // System.out.println();
            System.out.println("Enter the address:");

            address[i] = str.next();

            System.out.println("Enter the age:");
            age[i] = str.nextInt();

        }
        System.out.println("*************************");
        System.out.println("Enter the location:");
        int l = str.nextInt();
        int k=l-1;
        System.out.println("*************Employee details************");
        System.out.print(" Name :"+name[k]+"\n Emp id:"+id[k]+"\n Phno:"+number[k]+"\n Age:"+age[k]+"\n Address:"+address[k]);
    }
}
class employeedet2 {
    public static void main(String[] args){
        Scanner st=new Scanner(System.in);
        System.out.println("enter no of employee:");
        int n=st.nextInt();
        employee1 emp=new employee1();
        emp.detail(n);
    }
}