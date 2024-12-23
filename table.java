package programtask;
import java.util.Scanner;

public class table {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the table:");
		int table=in.nextInt();
		System.out.println("Enter the limt you want:");
		int limit=in.nextInt();
		for(int i=1;i<=limit;i++) {
			
			System.out.println(i +" x "+ table +" = "+(i*table) );
		}
	}

}

