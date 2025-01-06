package Examination;
import java.util.Scanner;

public class GreatestNumber {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=in.nextInt();
		int num2=in.nextInt();
		int num3=in.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+" is a greater number");
		}
		
		else if(num2>num3){
			
			System.out.println(num2+" is a greater number");
		}
		
		else {
			System.out.println(num3+" is a greater number");
		}


		
	}

}
