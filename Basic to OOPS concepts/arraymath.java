import java.util.*;
public class arraymath {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int size= inp.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=inp.nextInt();
        }

        int temp;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
            if(arr[i]>arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            }
        }
        System.out.println(arr[size-1]+arr[size-2]);
    }
}
