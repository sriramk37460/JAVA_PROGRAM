import java.util.Scanner;

public class codecheff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[]= new int [4];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
        }
        int high=0;
        int low=0;
        //array is collected find the min and max of the array using one loop
        for (int i = 0; i < arr.length; i++) {
             high=arr[0];
             low=arr[0];
            if (arr[i]>arr[0]){
                high=arr[i];
            }
            else{
                low=arr[i];
            }
        }
        System.out.println("THE MAX IS :"+high);
        System.out.println("The min is "+low);


    }
}
