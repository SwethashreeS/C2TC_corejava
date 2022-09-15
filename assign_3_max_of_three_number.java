package Com.tns.assignments;
import java.util.*;

public class assign_3_max_of_three_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is  greater");
			}
		}
			else if(b>c) {
				System.out.println("B is  greater");
			}
			else {
				System.out.println("C is  greater");	
			}
		
	}

}
