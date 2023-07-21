import java.util.*;
public class numpattern {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        for(int i=0;i<n;i++){
            if(i>0){
                for(int j=i;j>0;j--){
                   System.out.print((i+j)-(i));
                }
            }
            for(int j=0;j<=i;j++){
                if(i==0)
                System.out.print((i+j));
                else
                    System.out.print((i+j)-(i));
            }
            System.out.println();
        }
    }
}
