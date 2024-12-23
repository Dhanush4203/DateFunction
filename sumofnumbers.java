package programtask;

public class sumofnumbers {
	public static void main(String args[]) {
		int sumofeven=0;
		int sumofodd=0;
		for(int i=0;i<=20;i++) {
			
			if(i%2==0 && i>=2 ) {
				
				sumofeven=sumofeven+i;
				
			}
			else {
				
				sumofodd=sumofodd+i;
				
			}
			
		}
		System.out.println("Sum of even number is "+sumofeven);
		System.out.println("Sum of odd number is "+sumofodd);
		
	}
	}
	


