import java.util.*;
public class empconst {
    int id;
    String name;
    //void
    empconst(String n,int i){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(name+" "+id);
    }
    public static void main(String args[]){
        empconst e1=new empconst("prithiv",39);
       // empconst e2=new empconst("prithivi",29);
        int t=15;
        while(t>0) {
            e1.display();
           // e2.display();
            t--;
        }
    }
}