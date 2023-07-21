import java.util.*;
public class betweentwobuilding {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n= inp.nextInt();
        int arr[]=new int[n];
        int middle,min=0,result=0;
        for(int i=-0;i<n;i++){
            arr[i]= inp.nextInt();
        }
        int len=arr.length;
        middle=len-2;
        min=Math.min(arr[0],arr[len-1]);
        result = min * middle;
            System.out.println(result);
    }
}
