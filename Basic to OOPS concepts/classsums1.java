import java.util.*;
import java.lang.*;
public class classsum {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        String s=num.nextLine();
        System.out.print("enter location:");
        int no= num.nextInt();
        String c=s;
       split spl=new split();
       spl.split_op(s,no);
       options opts=new options();
       opts.chnage_opt(s,no,c);

    }
}
class split{
    void split_op(String s,int no){
        Scanner num=new Scanner(System.in);
        String a[]=s.split(" ");
        char b[];

        int l=a.length;
        for(int j=0;j<l;j++) {
            b = a[j].toCharArray();
            int len=b.length;
            if(j==no){
                for(int k=0;k<len;k++) {
                    System.out.print("_");
                }System.out.print(" ");
            }
            else{

                System.out.print(a[j]+" ");
            }
        }
        System.out.println();
    }
}
class options{


    void chnage_opt( String s,int no,String c){

        options opts1=new options();
        String check;
        Scanner num=new Scanner(System.in);
        int count=0,count1=0,counts=0;
        String a1[]=s.split(" ");
        char b1[];
        int l=a1.length;

        System.out.println();
        System.out.println("enter word:");
        String opt=num.next();
        System.out.println("enter word:");
        String opt1=num.next();
        String crt=opt;
        String temp;
        System.out.println("enter tot_person:");
        int q= num.nextInt();
        for(int i=0;i<q;i++){

            System.out.println("****** "+(i+1)+" person ******");
        System.out.println("enter option:");
        int option= num.nextInt();


        switch(option){
            case 1:
                check=opt;
                for(int j=0;j<l;j++) {
                    b1 = a1[j].toCharArray();
                  //  int len=b1.length;
                    if(j==no){
                        temp=a1[j];
                        a1[j]=opt;


                        //System.out.print(opt+" ");
                    }
                    //else{
                      //  System.out.print(a1[j]+" ");
                    //}
                    System.out.print(a1[j]+" ");

                }
                
                c= Arrays.toString(a1);
                count+=1;
                opts1.c_or_n(check,crt,c);
                break;
            case 2:
                check=opt1;
                for(int j=0;j<l;j++) {
                    b1 = a1[j].toCharArray();
                    //int len=b1.length;
                    if(j==no){
                      //  System.out.print(opt1+" ");
                        temp=a1[j];
                        a1[j]=opt1;

                    }
                    //else{
                      //  System.out.print(a1[j]+" ");
                    //}
                    
                    System.out.print(a1[j].toUpperCase()+" ");

                }
                count1+=1;
                c= Arrays.toString(a1);
                opts1.c_or_n(check,crt,c);
                break;
            default:
                System.out.println("'invalid option'");
                counts+=1;
                break;
        }
        if(i==q-1){
            opts1.percentage(q,count,count1,counts,opt,opt1);
        }
        }


    }
    void c_or_n(String check,String crt,String c){
        options opts1=new options();
        //double per=(counts/q)*100;
        if(crt.equals(check)){
            System.out.println("\n'Correct option'");


        }
        else{
            System.out.println("\n'wrong option'");


        }
        System.out.println(c);

    }
    void percentage(int q,int count,int count1,int counts,String opt,String opt1){
       // options opts1=new options();
        double count3=count;
        double count4=count1;
        double counts1=counts;
        double q1=q;
        double per=(count3/q1)*100;
        double per1=(count4/q1)*100;
        double per2=(counts/q1)*100;
        System.out.println("***** percentage *****");
        System.out.println("'"+opt+"' is "+per+"%");
        System.out.println("'"+opt1+"' is "+per1+"%");
        System.out.println("'invalid' is "+per2+"%");


    }
}
