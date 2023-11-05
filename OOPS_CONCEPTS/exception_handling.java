package OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args) {
        int a=1,b=0,c,d;
        int arr[]=null;
        try{
            c=a/b;
        }
        catch (ArithmeticException e){
            System.err.println(e);
        }
        try{
            System.out.println(arr[1]);
        }
        catch (Exception e){
            System.err.println(e);
        }
        File fb=new File("abc.txt");
        try {
            FileInputStream f=new FileInputStream(fb);
        } catch (FileNotFoundException e) {
            System.err.println(e);
            //e.printStackTrace();
            //throw new RuntimeException(e);
        }
        try(Scanner inp=new Scanner(System.in)){
            d=inp.nextInt();
        }
        System.out.println(d);
    }
}
