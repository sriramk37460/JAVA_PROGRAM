import java.util.*;
class ebconsumer{
    int consm_num;
    String consm_name;
    int prev_month_reading;
    int cur_month_reading;
    int unit;
    /*void consumer(int consumer_num,String consumer_name){
              cons_num=consumer_num;
              cons_name=consumer_name;
              System.out.println(cons_num+","+cons_name);
              ebconsumer mems=new ebconsumer();
              mems.cons(cons_num,cons_name);
    }*/
    void cons(int consumer_num,String consumer_name){
      // int prev_month_reading;
       //int cur_month_reading;
       consm_num=consumer_num;
       consm_name=consumer_name;
       String type_of_eb_connection;
        if(consm_num==101){
            prev_month_reading=99700;
            cur_month_reading=99750;
            unit=cur_month_reading-prev_month_reading;
        }
        else if(consm_num==102){
            prev_month_reading=99680;
            cur_month_reading=99800;
            unit=cur_month_reading-prev_month_reading;
        }
        else{
            prev_month_reading=99200;
            cur_month_reading=99800;
            unit=cur_month_reading-prev_month_reading;
        }
       Scanner num=new Scanner(System.in);
        System.out.println("eb connenction is domestic or commercial:");
        int opt= num.nextInt();

        switch(opt){
            case 1:

                cost(unit,consm_num,consm_name);



            case 2:cost1(unit,consm_num,consm_name);

          //  default:
            //    System.out.println("your are enter wrong option!");

        }
    }

        void cost(int unit,int consm_num,String consm_name){
            if(unit>=0 && unit<101){
                double rs=unit*1;
                System.out.println(consm_num+" "+rs);
            }
            else if(unit>100 && unit<201){
                double rs=unit*2.50;
                System.out.println(rs);
            }
            else if(unit>200 && unit<501){
                double rs=unit*4;
                System.out.println(rs);
            }
            else{
                double rs=unit*6;
                System.out.println(rs);
            }
        }
    void cost1(int unit,int consm_num,String consm_name){
        System.out.println("commercial");
        if(unit>=0 && unit<101){
            double rs=unit*5;
            System.out.print(rs);
        }
        else if(unit>100 && unit<201){
            double rs=unit*10;
            System.out.print(rs);
        }
        else if(unit>200 && unit<501){
            double rs=unit*20;
            System.out.print(rs);
        }
        else{
            double rs=unit*25;
            System.out.print(rs);
        }
    }
    }


public class simple11 {
    int cons_num;
    String cons_name;
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        System.out.print("enter consumer number:");
        int consumer_num= num.nextInt();
        System.out.print("enter consumer name:");
        String consumer_name=num.next();
        ebconsumer mem=new ebconsumer();
        mem.cons(consumer_num,consumer_name);
    }
}