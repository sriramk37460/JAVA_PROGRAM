import java.util.*;

class worldwar{


   public static void main(String args[]){
            
             Scanner num=new Scanner(System.in);
            
             int test=num.nextInt();
int count=0;
     
             
             while(test>0){
                       
                // String wwr=num.nextLine();
                 char[] arr=num.next().toCharArray(); 
                int n=arr.length;
               
                
                int b;
              // char a=W;
                 for(int i=0;i<arr.length;i++){
                  
                         if(arr[i]=='B'){
                               count++;}
                               
                          else{
                             count=0;
                     }
System.out.println(count);

                  }
                  test--;
                  
                }
              

}}