import java.util.*;
public class charfq {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        String str= inp.nextLine();
        char arr[]=str.toCharArray();
        char ch[]=new char[100];
        int ar[]=new int[100];
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && arr[i]!=' ' && arr[j]!=' '){
                    count++;
                    arr[j]=' ';
                }
            }
            ch[i]=arr[i];
            ar[i]=count+1;
        }
        for(int i=0;i<100;i++){
            if(ch[i]!=' ' && ch[i]!='\0'){
                System.out.println(ch[i]+" count is:"+ar[i]);
            }
        }

    }
}
