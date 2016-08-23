package nl.programIt;

import nl.programIt.service.impl.DomainServiceImpl;
import nl.programIt.service.interfaces.IDomainService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoaderClass {
  static ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
	
	public static IDomainService getDomainService(){
		 return (IDomainService)context.getBean(IDomainService.class);
	}
}
