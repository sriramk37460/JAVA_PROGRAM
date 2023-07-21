import java.util.*;
public class pyramid {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int ch=65;
        char chr=' ';
        for(int i=0;i<n;i++){

            for(int j=0;j<=i;j++){
                ch=97;
                if(i%2==0){
                    if(j%2==0){
                        System.out.print(i+1);

                    }
                    else{
                        ch=ch+i;
                        chr=(char)ch;
                        System.out.print(chr);
                    }
                }
                else{
                    if(j%2==0){
                        ch=ch+i;
                        chr=(char)ch;
                        System.out.print(chr);

                    }
                    else{
                        System.out.print(i+1);

                    }
                }
            }
            System.out.println();
        }
    }
}
