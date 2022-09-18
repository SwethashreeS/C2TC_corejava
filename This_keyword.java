package Com.tns.assignments;

public class This_keyword {
	int c;
	public  This_keyword(int c){
		this.c=c;
	}
	
	
	
	
	public static void main(String[] args) {
		
		This_keyword vc=new This_keyword(5);
		System.out.println("the value of this c is ="+vc.c);
	}

}
