import java.util.*;
class ex2 {
    public boolean isValid(String s) {
        int len = s.length();
        char arr[] = s.toCharArray();
        int counts=0,count=0, count1=0, count2=0;
        boolean ans;
        for (int i = 0; i < len; i++) {

            if (arr[i] == '(') {
                  count++;
            } else if (arr[i] == ')') {
                  count--;
            } else if (arr[i] == '[') {
                  count1++;
            } else if (arr[i] == ']') {
                  count1--;
            } else if (arr[i] == '{') {
                  count2++;
            } else if (arr[i] == '}') {
                  count2--;
            }
        }
        counts=(count+count1+count2);
        if(counts>0){
            ans=false;
        }
        else{
            ans=true;
        }
      //System.out.println(counts);
      return ans;
    }
        public static void main(String args[]){
            Scanner num=new Scanner(System.in);
            String s=num.next();
            ex2 e=new ex2();
            e.isValid(s);
        }

    }