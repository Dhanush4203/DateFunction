package Examination;
import java.util.Scanner;

public class SquareRoot {
	public static void main(String args[]){
		double n1,n2,d;
		Scanner in =new Scanner (System.in);
		System.out.println("Enter three numbers");
		double num1=in.nextInt();
		double num2=in.nextInt();
		double num3=in.nextInt();
		
		 d= (num2*num2)-(4*num1*num3);
		
		 if(d==0) {
			 System.out.println("roots are real and equal");
			 n1=n2=-num2/(2*num1);
			 System.out.println("n1 =" + n1);
			 System.out.println("n2 =" + n2);
			 
		 }
		 else if(d>0) {
			 System.out.println("Roots are real and distict");
			 n1=(-num2+Math.sqrt(d))/(2*num1);
			 n2=(-num2-Math.sqrt(d))/(2*num1);
			 System.out.println("n1 =" + n1);
			 System.out.println("n2 =" + n2);
			 
		 }
		 else {
			 System.out.println("Roots are distict and imaginary");
			 double x=-num2/(2*num1);
			 double y=Math.sqrt(-d)/(2*num1);
			 System.out.println("n1="+x+"+i"+y);
			 System.out.println("n1="+x+"-i"+y);
		 }
		
	}

}
