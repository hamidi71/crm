package nl.programIt;

import java.util.Locale;

import org.hibernate.property.Getter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

//zie mvc-context
@Configuration //normaal config
@EnableWebMvc //countneur spring mvc
@ComponentScan(basePackages="nl.programIt.controllers")
public class WebAppConfig extends WebMvcConfigurerAdapter{
	
	/*<mvc:resources location="/resources/public/" mapping="
		/resources/**"/>*/
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/public/");
	}
//config Theamleaf
	//zoekt thymleafplaats
	@Bean(name="templateResolver")
	public ServletContextTemplateResolver templateResolver(){
		ServletContextTemplateResolver resolver=new ServletContextTemplateResolver();
		resolver.setPrefix("/WEB-INF/templates/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode("HTML5");
		return resolver;
	} 
	//config en ralatie tussen spring mvc en thymeleaf
	@Bean(name="templateEngine")
	public SpringTemplateEngine templateEngine(){
		SpringTemplateEngine engine=new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver());		
		return engine;	
	}
	//resolver analyset werkt aleen met thymeleaf
	@Bean(name="viewResolver")	
	 public ThymeleafViewResolver getViewResolver(){
    	ThymeleafViewResolver resolver = new ThymeleafViewResolver(); 
    	resolver.setTemplateEngine(templateEngine());
	return resolver;
    }	
	
//Hier onde zijn de beans van i18n(internationalisation) voor de taals
	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource messageS =new ResourceBundleMessageSource();
		messageS.setBasename("messages");//name zonder code _en.propreties		
		return messageS;
	}
	
	
	@Bean //Taal par default
	public LocaleResolver localeResolver(){
		SessionLocaleResolver localeR = new SessionLocaleResolver();
		Locale loc = new Locale("nl");
		Locale.setDefault(loc);
		localeR.setDefaultLocale(loc);//nl is zelfde voor Nederlands
		//localeR.setDefaultLocale(Locale.US);//us is zelfde als Englich
		return localeR;
	}
	
	@Bean //intercepteur (reciver) voor change het taal
	public LocaleChangeInterceptor localeChangeInterceptor(){
		LocaleChangeInterceptor  changeInterceptor=new LocaleChangeInterceptor();
		changeInterceptor.setParamName("lang");		
		return changeInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(this.localeChangeInterceptor());
	}
	
	
	
	
}
