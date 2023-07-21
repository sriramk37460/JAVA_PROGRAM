import  java.util.*;
public class travel {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        int n= inp.nextInt();
        int a[]=new int[n];
        int b,c=0;
        int count=1,temp=0;

        for(int i=0;i<n;i++){
            a[i]= inp.nextInt();
        }
        if(n<2){
            System.out.println("invalid");
        }
        else{
            b=a[0];
            for (int i=1;i<n;i++){
                if(a[i]==b){
                    count++;
                }

            }
            if(n-count==0){
                System.out.println("all are equal");
                c=1;
            }
            if(c!=1){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>=a[j]){
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }


                }
            }
                System.out.println(a[0]+" "+a[1]);
        }}

    }
}
