package Examination;

public class ComparingTwoString {

	public static void main(String[] args) {
		
		        String s1 = "hello";
		        String s2 = "hello";

		        int Result = s1.compareToIgnoreCase(s2);

		        if (Result < 0) {
		            System.out.println(s1+" comes before "+s2+" lexicographically");
		        } else if (Result > 0) {
		            System.out.println(s2+" comes before " +s1+" lexicographically");
		        } else {
		            System.out.println(s1+" and "+s2+" are lexicographically equal");
		        }

	}

}
