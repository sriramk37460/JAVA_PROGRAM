import java.util.*;

public class plumberpipe {
    public static void main(String args[]){
        int input,output,rust;
        Scanner in =new Scanner(System.in);
        input=in.nextInt();
        output=in.nextInt();
        rust=in.nextInt();
        int inp[]=new int[input];
        int out[]=new int[output];
        int total_of_inp=0;
        int total_of_out=0;
        for(int i=0;i<input;i++){
            inp[i]=in.nextInt();
        }
        for(int i=0;i<input;i++){
            total_of_inp+=inp[i];
        }
        for(int j=0;j<output;j++){
            out[j]=in.nextInt();
        }
        for(int j=0;j<output;j++){
          total_of_out+=out[j];
        }
        System.out.println(total_of_out+","+total_of_inp);
        if(total_of_inp==total_of_out){
            System.out.println("balanced");
        }
        else if(total_of_inp>total_of_out){
            System.out.println((total_of_out-total_of_inp)-rust);
        }
        else{
            System.out.println((total_of_out-total_of_inp)+rust);

        }
    }
}



/*
3 3 2
85 75 95
70 80 45
 */