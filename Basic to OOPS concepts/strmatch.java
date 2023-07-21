import java.util.*;
public class strmatch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        String str2 = inp.next();
        char arr[] = str.toCharArray();
        char arr2[] = str2.toCharArray();
        int hold = str.compareTo(str2);

        if (hold==0) {
            System.out.println(hold);

        }
        else{
            int count=0,c,d;
            for (int i = 0; i < str.length(); i++) {
                   c=0;
                   d=0;
                for (int j = 0; j <str2.length() ; j++) {

                        if(c==0 && arr[i]==arr2[j]){
                            c=1;
                            arr2[j]='0';
                        }
                        else if((c==0 && d==0)&&(arr[i]!=arr2[j] && arr2[j]!='0')){
                            count++;
                            d=1;

                        }

                }

            }
            System.out.println(count);
            //System.out.println(Arrays.toString(arr2));
        }
    }
}
