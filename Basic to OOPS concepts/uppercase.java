import java.util.*;
public class uppercase {

    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter the string:");
        String s=inp.nextLine();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                ch[i]=Character.toUpperCase(ch[i]);
            }
            System.out.print(ch[i]);
        }

    }
}
