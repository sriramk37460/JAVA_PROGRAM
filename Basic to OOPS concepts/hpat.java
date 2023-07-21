import java.util.*;
class hpat{
    public static void main(String args[]){
       
     Scanner pat=new Scanner(System.in);
     int n=pat.nextInt();

     for(int i=1;i<=n+(n-1);i++){
              
            for(int j=1;j<=n+(n+1);j++){
             
                if(i!=n && j==1 || j==2 || j==n+n || j==n+(n+1)){
                     
                       System.out.print("#");
                 }
              else if(i==n && (j==1 || j==2 || j==n+n || j==n+(n+1))){
                    
                    
                        System.out.print("#");
                       }
                    
              else if(i==n && (j>=3 || j<=n+(n-1))){
                    if(j%2==0)
                    {
                        System.out.print("$");
                     }
                   else{
                  System.out.print(" ");
                        }

                       }  
               
               else{
                  System.out.print(" ");
                        }
              }  System.out.println();
          

       }
}}