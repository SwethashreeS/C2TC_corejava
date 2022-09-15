package Com.tns.assignments;


public class assign_8_product_of_ten_neg_numbers {

	public static void main(String[] args) {
		
		int array[]= {-1,2,-4,5,9,7,5,2,0,1};
		int sum=1;
		for(int i=0;i<10;i++) {
			if(array[i]<0) {
				sum=sum*array[i];
			}
			
		}
		System.out.println("the product of negative numbers is  "+sum);
	}
}
