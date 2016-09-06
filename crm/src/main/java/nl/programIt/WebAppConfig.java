package nl.programIt;

import java.util.Locale;

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
	

	@Bean
	public InternalResourceViewResolver resolverView(){
		InternalResourceViewResolver resolver= new InternalResourceViewResolver();
		resolver.setSuffix(".jsp");
		resolver.setPrefix("/WEB-INF/views/");
		return resolver;
	}
	
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
