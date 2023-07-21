import java.util.*;
class rect{
    static void display1(){
        System.out.println("*********************rectangle******************************");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length value:");
        int length=sc.nextInt();
        System.out.println("enter width value:");
        int width=sc.nextInt();
        int area_of_rect=length*width;

        System.out.println("area of rectangle : "+area_of_rect);
        System.out.println();
    }}

        class tri{
            static void display2(){
                System.out.println("*********************triangle******************************");
                Scanner sc1=new Scanner(System.in);
                System.out.println("enter base value:");
                int base=sc1.nextInt();
                System.out.println("enter height value:");
                int height=sc1.nextInt();
                int a=base*height;
                int area_of_tri=a/2;

                System.out.println("area of triangle : "+area_of_tri);
                System.out.println();
            }}
        class circ{
            static void display3() {
                System.out.println("*********************circle******************************");
                Scanner sc2 = new Scanner(System.in);
                double pi=3.14;
                System.out.println("enter radius value:");
                float r = sc2.nextFloat();
                // int height=sc1.nextInt();
                double area_of_circ = pi * r * r;
                System.out.println("area of circle : "+area_of_circ);
                System.out.println();
            }}

        class main{
    public static void main(String args[]){
        int a=5;
        rect myobj=new rect();
        tri myobjs=new tri();
        circ myobjss=new circ();
        myobj.display1();
        myobjs.display2();
        myobjss.display3();

    }
}