package Examination;
import java.util.Scanner;

public class PositiveorNegative {
	public static void main(String args[]) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int input=in.nextInt();
		
		if(input>=0) {
			System.out.println(input +" is a positive Number");
		}
		else {
			System.out.println(input +" is a Negative Number");
		}
	}

}
