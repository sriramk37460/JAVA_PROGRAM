import java.util.Scanner;
public class str {
	public static void main(String[] args) {
	Scanner strr=new Scanner(System.in);	
		String n=strr.nextLine();
		//int a=strr.nextInt();
		//System.out.println(""+n.length());
		int num=n.length();
		if(num%2==0) {
		for(int i=0;i<n.length()+1;i++) {
			System.out.print("*");
		}
		System.out.print(n);
		for(int i=0;i<n.length()+1;i++) {
			System.out.print("*");
		}
		}
		else {
			for(int i=0;i<n.length()-1;i++) {
			System.out.print("*");
			}
			System.out.print(n);
			for(int i=0;i<n.length()-1;i++) {
				System.out.print("*");
				}
		}
		

	}

}