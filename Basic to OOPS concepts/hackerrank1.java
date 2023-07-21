import java.util.*;
class Solutions {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] digit = digits;
        System.out.print(len);
        int[] result = new int[len + 1];
        int[] result1 = new int[len];
        int temp = 0, temp1 = 0;
        if (digit[len - 1] == 9) {

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len + 1; j++) {
                    if (i == len - 1) {
                        result[j] = 1;
                        result[j + 1] = 0;
                        temp++;
                    } else {
                        result[j] = digit[i];
                        temp++;
                    }

                }
            }
        } else {
            for (int i = 0; i < len; i++) {

                if (i == len - 1) {
                    result1[i] = digit[i] + 1;
                    temp1++;
                } else {
                    result1[i] = digit[i];
                    temp1++;
                }

            }
        }

            if (digit[len - 1] == 9)
                return result;
            else
                return result1;


    }
}
public class hackerrank1{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] digits = new int[5];
        for (int i = 0; i < 5; i++) {
            digits[i] = input.nextInt();
        }
        Solutions s = new Solutions();
        s.plusOne(digits);
    }}