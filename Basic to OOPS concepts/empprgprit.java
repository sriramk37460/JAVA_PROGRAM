import java.util.Scanner;
import java.util.Arrays;
class empprgprit
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Details can Store Name,Age,Id,Location...");
        System.out.println("Enter no of Employees:");
        int n=s.nextInt();
        input in=new input();
        String[] ars=in.arr(n);
        output ii=new output();
        ii.res(ars,n);
    }
}
class input
{   
    Scanner s=new Scanner(System.in);
    String[] arr(int n)
    {
        String[] arrs=new String[n*4];
        for(int i=0;i<n*4;i++)
        {   
            if(i<n)
            {
            System.out.println("Enter Name:");
            arrs[i]=s.next();
            }
            else if(i>=n && i<n*2)
            {
                System.out.println("Enter Age:");
                arrs[i]=s.next();
            }
            else if(i>=n*2 && i<n*3)
            {
                System.out.println("Enter Id:");
                arrs[i]=s.next();
            }
            else if(i>=n*3 && i<n*4)
            {
                System.out.println("Enter Location:");
                arrs[i]=s.next();
            }
        }
        return arrs;
    }
}
class output
{   
    Scanner s=new Scanner(System.in);
    void res(String[] arrs,int n)
    {
    System.out.println("Enter The Employee Id:");
    String com=s.next();
    int po=0;
    for(int q=0;q<n*4;q++)
    {
        if(arrs[q].equals(com))
        {
            po=q;
        }
    }
    int fe=po;
    int [] st=new int[4];
    for(int p=0;p<4;p++)
    {   
        if(p==3)
        {
            st[p]=fe+n;
        }
        else
        {
        st[p]=po;
        po-=n;
        }
    }
    Arrays.sort(st);
    int count=1;
    for(int i=0;i<st.length;i++)
    {   
        if(count==1)
        {
        System.out.println("Employee Name:"+arrs[st[i]]);
        }
        else if(count==2)
        {
            System.out.println("Employee Age:"+arrs[st[i]]);
        }
        else if(count==3)
        {
            System.out.println("Employee Id:"+arrs[st[i]]);
        }
        else if(count==4)
        {
            System.out.println("Employee Location:"+arrs[st[i]]);
        }
        count++;
    }
    }
}