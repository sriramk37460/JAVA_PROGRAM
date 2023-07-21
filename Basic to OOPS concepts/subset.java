import java.util.*;
public class subset {
    void subset(int a[],int n,int index,int sub[]){
        int i;
        if(index==n)
        {
            for(i=0;i<n;i++)
            {
                if(sub[i]==1)
                    System.out.print(a[i]+" ");

            }
            System.out.println();
        }
        else
        {

            sub[index]=1;
            subset(a,n,index+1,sub);
            sub[index]=0;
            subset(a,n,index+1,sub);

        }
    }
    public static void main(String args[]){
        Scanner inp =new Scanner(System.in);
        subset sc=new subset();
        int index=0;
        int n= inp.nextInt();
        int a[]=new int[n];
        int sub[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=inp.nextInt();
        }
        sc.subset(a,n,index,sub);

    }
}

