import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the input:");
        int n =s.nextInt();
        int arr[]=new int[n];
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Values:");//10 20 30 40 50 = 30 40 50 10 20
            arr[i]=s.nextInt();
        }
        int mid=(n/2);
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(j<=mid) {
                res[i] = arr[mid + i];
                j++;
            }
            else {
                res[i]=arr[(i-1)-mid];
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",res[i]);
        }
    }
}