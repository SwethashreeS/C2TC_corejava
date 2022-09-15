package Com.tns.assignments;
import java.util.*;

public class assign_2_check_multiple_of_three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number");
		int g=sc.nextInt();
		if((g%3)==0) {
              System.out.println("The number is multiple of three");
		}
		else {
			System.out.println("the number is not multiple of three");
		}
	}

}
