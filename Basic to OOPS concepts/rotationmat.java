import java.util.*;
public class rotationmat {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("flag element:");
        int flag = inp.nextInt();
        System.out.println("size:");
        int size = inp.nextInt();
        int arr[][] = new int[size][size];
        System.out.println("enter element:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = inp.nextInt();
            }}
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            for (int i = 0; i < size; i++) {
                int low = 0, high = size - 1;
                while (low < high) {
                    int temp = arr[i][low];
                    arr[i][low] = arr[i][high];
                    arr[i][high] = temp;
                    low++;
                    high--;
                }
            }
            System.out.println("rotation");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

    }


