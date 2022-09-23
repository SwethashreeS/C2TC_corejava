package Amazon;

public class Non_prime_account implements Amazon {
	public void delivery_charges()
	{
		System.out.println("delivery charges for non primeaccount holders= 100Rs");
	}

	public static void main(String[] args)
	{
		prime_account ob=new prime_account();
		ob.delivery_charges();
		
		Non_prime_account ob1=new Non_prime_account();
		ob1.delivery_charges();
		
		Amazon ob2=new prime_account();
		ob2.delivery_charges();
	}
}
