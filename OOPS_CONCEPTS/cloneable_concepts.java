package OOP;
class library implements Cloneable{
    static String library_name1;
    library(String library_name1){
        this.library_name1=library_name1;
    }
   String getlibrary(){
       return library_name1;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
class book implements Cloneable{
     String name;
     int price;
    library library_name;
    void book_det(String name,int price,library library_name){
        this.name=name;
        this.price=price;
        this.library_name=library_name;
    }
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
    String getlibrary_name(){
        return library_name.getlibrary();
    }
    public Object Clone() throws CloneNotSupportedException {
        book b1=(book)super.clone();
        b1.library_name=(library)b1.library_name.clone();
        return b1;
    }
}
public class cloneable_concepts {
    public static void main(String[] args) throws CloneNotSupportedException {
        library l=new library("Udumalpet");

        book b=new book();
        b.book_det("ice and fire",200,l);
        book b1= (book) b.Clone();
        l.library_name1="coimbatore";
        System.out.println(b1.getName()+" "+b1.getPrice()+" "+b1.getlibrary_name());

        System.out.println(b.getName()+" "+b.getPrice()+" "+b.getlibrary_name());


    }
}
