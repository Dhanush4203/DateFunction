package Examination;

public class SearchNumber {
	public static void main(String args[]) {
		int a[]= {10,20,30,40,50};
		int num,i=0;
		for(i=0;i<a.length;i++) {
			
			if(a[i]==50) {
				num=1;
			}
			else {
				num=0;
			}
			if(num==1)
			{
				System.out.println("position ofnumber is"+i);
			}
			else {
				System.out.println("invalid");
			}
			
		}
	}

}
