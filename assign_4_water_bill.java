package Com.tns.assignments;
import java.util.*;

public class assign_4_water_bill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of gallons used");
		int w=sc.nextInt();
		if(w<=45)
		{
			System.out.println("No tax");	
		}
		else if((w>45)&&(w<=75)) {
			System.out.println("the tax rate is 475");
			
		}
		else if((w>75)&&(w<=125)) {
			System.out.println("the tax rate is 750");
			
		}
		else if((w>125)&&(w<=200)) {
			System.out.println("the tax rate is 1225");
			
		}
		else if((w>200)&&(w<=350)) {
			System.out.println("the tax rate is 1650");
			
		}
		else
		{
			System.out.println("the tax rate is 2000");
		}
	}

}
