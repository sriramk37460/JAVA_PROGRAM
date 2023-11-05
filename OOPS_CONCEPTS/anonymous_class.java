class cycle{
    void display(){
        System.out.println("this is cycle");
    }
}
public class anonymous_class {
    public static void main(String[] args) {
        //Anonymous used in interface obj also
        cycle c=new cycle()
                {
                    void display(){
                      System.out.println("this is bicycle");
                    }
                };
        c.display();
    }
}
