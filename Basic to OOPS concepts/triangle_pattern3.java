import java.util.*;

class tripat2{

public static void main(String args[]){

Scanner num=new Scanner(System.in);
int n=num.nextInt();


for(int i=0;i<n;i++){
 /* for(int k=i;k<n-1;k++){
    System.out.print("  ");
}*/





    for(int j=0;j<i;j++){
          System.out.print("*");
       
       for(int k=j+2;k<i-1;k++){
    System.out.print(" ");
}

   }
   

System.out.println();
}
}
}