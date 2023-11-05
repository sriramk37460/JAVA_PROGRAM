package OOP;
import java.lang.Enum;
enum Level{
    BEGINNER("B"),INTERMEDIATE("I"),ADVANCED("A");
    private  String abr;
    private Level(String ab){
        //System.out.println(this.toString());
        String abr=ab;
    }
    String getAbr(){
        return abr;
    }

}

public class enumeration {
    Level lev;
    public enumeration(Level lev){this.lev=lev;}
    public  void levLike(){
        switch (lev){
            case BEGINNER :
                System.out.println("beginner");
                break;
            case INTERMEDIATE:
                System.out.println("intermediate");
                break;
            case ADVANCED:
                System.out.println("advanced");
                break;
            default:
                System.out.println("none");
                break;
        }
    }
    public static void main(String[] args) {
        String str="ADVANCED";
        enumeration e=new enumeration(Level.valueOf(str));
        e.levLike();
        Level l=Level.ADVANCED;
        System.out.println(l.toString());
        System.out.println(l.getAbr());
        System.out.println(l.ordinal());
        //System.out.println(l.getAbr().compareTo(null));
    }
}
