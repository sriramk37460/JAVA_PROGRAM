import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        String t=s;
        int len=t.length();
        char arr[]=t.toCharArray();
        int total;
        int sum=0;
        for(int i=0;i<len;i++){
            if(arr[i]=='I'){
                total=1;
                sum=sum+total;

            }
            else if(arr[i]=='V'){
                total=5;
                sum=sum+total;
            }
            else if(arr[i]=='X'){
                total=10;
                sum=sum+total;
            }
            else if(arr[i]=='L'){
                total=50;
                sum=sum+total;
            }
            else if(arr[i]=='C'){
                total=100;
                sum=sum+total;
            }
            else if(arr[i]=='D'){
                total=500;
                sum=sum+total;
            }
            else if(arr[i]=='M'){
                total=1000;
                sum=sum+total;
            }

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String s= input.next();
        Solution num=new Solution();
        num.romanToInt(s);
    }
}
