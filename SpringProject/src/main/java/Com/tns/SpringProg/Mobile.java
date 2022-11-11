package Com.tns.SpringProg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
 public static void main(String[] args)
 {
	 ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	 System.out.println("Configuration loaded");
	 Sim s1=c.getBean("s1",Airtel.class);
	 Sim s2=c.getBean("s2",Jio.class);
	 s1.calling();
	 s1.data();
	 s2.calling();
	 s2.data();
	 
 }
}
