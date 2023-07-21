import java.util.*;
class ebconsumer{

    int prev_month_reading;
    int cur_month_reading;
    int unit;


    String consumer_num;
    String consumer_name;
    void cons(int members){
        Scanner num=new Scanner(System.in);
        int n=members;
        int m=n*2;
      //  int[] consm_num=new int[n];
        String consm_name[]=new String[m];

        System.out.print("enter consumer det:");
        for(int i=0;i<m;i++) {
            consm_name[i] = num.next();
        }
        System.out.print("consumer number:");
        consumer_num = num.next();
        System.out.print("consumer name:");
        consumer_name=num.next();
       String type_of_eb_connection;
       for(int i=0;i<m;i++) {
           if (consumer_num.equals(consm_name[i]) && consumer_name.equals(consm_name[i+n])) {
               prev_month_reading = 99700;
               cur_month_reading = 99750;
               unit = cur_month_reading - prev_month_reading;
               cos(unit);
           } else if (consumer_num.equals(consm_name[i]) && consumer_name.equals(consm_name[i+n])) {
               prev_month_reading = 99680;
               cur_month_reading = 99800;
               unit = cur_month_reading - prev_month_reading;
               cos(unit);
           } else if (consumer_num.equals(consm_name[i]) && consumer_name.equals(consm_name[i+n])) {
               prev_month_reading = 99200;
               cur_month_reading = 99800;
               unit = cur_month_reading - prev_month_reading;
               cos(unit);
           }

           }
       }

    void cos(int unit){
        Scanner num=new Scanner(System.in);
        System.out.println("eb connenction is domestic or commercial:");
        int opt= num.nextInt();

        switch(opt){
            case 1:

                cost(unit);

                break;

            case 2:
                cost1(unit);
               break;
               default:
                    System.out.println("your are enter wrong option!");

        }
    }

        void cost(int unit){
            if(unit>=0 && unit<101){
                double rs=unit*1;
                System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
            }
            else if(unit>100 && unit<201){
                double rs=unit*2.50;
                System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
            }
            else if(unit>200 && unit<501){
                double rs=unit*4;
                System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
            }
            else{
                double rs=unit*6;
                System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
            }

        }
    void cost1(int unit){
        System.out.println("commercial");
        if(unit>=0 && unit<101){
            double rs=unit*5;
            System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
        }
        else if(unit>100 && unit<201){
            double rs=unit*10;
                    System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
        }
        else if(unit>200 && unit<501){
            double rs=unit*20;

                    System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
        }
        else{
            double rs=unit*25;

                    System.out.printf("name:"+consumer_name+"\n"+"id:"+consumer_num+"\n"+"prev month reading:"+prev_month_reading+"\n"+"current month reading:"+cur_month_reading+"\n"+"unit is:"+unit+"\n"+"rs:"+rs);
        }
    }
    }


public class simple11 {

    public static void main(String args[]){

        Scanner num=new Scanner(System.in);
        System.out.print("enter members:");
        int members= num.nextInt();

        ebconsumer mem=new ebconsumer();
        mem.cons(members);
    }
}