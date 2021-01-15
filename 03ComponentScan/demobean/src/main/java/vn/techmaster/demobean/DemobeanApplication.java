package vn.techmaster.demobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class DemobeanApplication {	
	private static ApplicationContext context;


	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(DemobeanApplication.class);
		//System.out.println("------------------------------------");
		//Car car = context.getBean(Car.class);
		//String typeRegiter = "Admin";
		//RegisterFactory rFactory = context.getBean(RegisterFactory.class);
		//Object obj = rFactory.createMember(typeRegiter);
		

	}
}
