import java.util.Scanner;

class cricket{
    int total_match;
    int win;
    void result(int n,int m){

        total_match=n;
        win=m;
       // Scanner inp=new Scanner(System.in);
        //total_match=inp.nextInt();
        //win=inp.nextInt();
      //  System.out.println("played matches:"+total_match+"\nwin matches:"+win);

    }
}
class player extends cricket{
    int id;
    String name;
    void view(){
        Scanner inp=new Scanner(System.in);
        System.out.print("\nid:");
        id= inp.nextInt();
        System.out.print("\nname:");
        name=inp.next();
      //  System.out.println("player id:"+id+"\nname:"+name);
    }
}
public class singleinheritance {
    public static void main(String args[]){
        int n,m;

        Scanner inp=new Scanner(System.in);
        System.out.print("\ntotal match:");
        n= inp.nextInt();
        System.out.print("\nwin:");
        m= inp.nextInt();
        player p1=new player();
        p1.view();
        p1.result(n,m);
        System.out.println("played matches:"+p1.total_match+"\nwin matches:"+p1.win);
        System.out.println("player id:"+p1.id+"\nname:"+p1.name);

    }
}
