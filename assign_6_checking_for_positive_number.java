package Com.tns.assignments;
import java.util.*;

public class assign_6_checking_for_positive_number {

	public static void main(String[] args) {
		System.out.println("enter number ");
		Scanner pn= new Scanner(System.in);
		int n=pn.nextInt();
		if(n<0) {
			System.out.println("Number is negative");
		}
		else if(n>0) {
			System.out.println("Number is positive");
		}
		else 
		{
			System.out.println("Number is zero");
		}
	}

}
