package Com.tns.assignments;
public class state_prog {

		public void print_state(){
			System.out.println("state= Karnataka");
		}
	}
	class city extends state_prog {
		public void print_city() {
			System.out.println("city=Bangalore");
		}
	}
	class district extends city{
		public void print_district() {
			System.out.println("district=Bangalore rural");
			
		}
	public static void main(String[] args) {
		district ob=new district();
		ob.print_state();
		ob.print_city();
		ob.print_district();
		
	}
	}
