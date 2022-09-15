package Com.tns.assignments;
import java.util.*;

public class assign_5_library_charges {

	public static void main(String[] args) {
		System.out.println("enter number of days");
		Scanner lb= new Scanner(System.in);
		int n=lb.nextInt();
		int f;
		if(n<=5) {
			f=n*1;
		}
		else if((n>5)&&(n<=10)) {
			f=5*1+(n-5)*5;
		}
		else {
			f=5*1+5*5+(n-10)*10;
			
		}
			
		System.out.println("The library charges for the unreturned book is"+f);  
	}

}
