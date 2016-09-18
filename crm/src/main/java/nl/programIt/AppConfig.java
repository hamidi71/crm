package nl.programIt;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//Anotation Spring deze is container
@ComponentScan(basePackages={"nl.programIt"})
@EnableJpaRepositories(basePackages="nl.programIt.repository")
@EnableTransactionManagement//Activation De add remove update
public class AppConfig {	
	@Bean//decalareren als een bean
	//Retour type is :class BasicDataSource 
	//naam methode: datasource()
	public DataSource dataSource(){
		BasicDataSource basic=new BasicDataSource();
		basic.setUrl("jdbc:mysql://localhost:3306/db_crm");
		basic.setDriverClassName("com.mysql.jdbc.Driver");
		basic.setUsername("root");
		basic.setPassword("");
		return basic;
	}
	
	//Retour type is :class LocalContainerEntityManagerFactoryBean 
	//naam methode: entityManagerFactory()
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean local=new LocalContainerEntityManagerFactoryBean();
		local.setDataSource(this.dataSource());//class datasource
		local.setPackagesToScan("nl.programIt.entities");
		local.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return local;		
	}
	
	@Bean
	public PlatformTransactionManager transactionManager(){
		JpaTransactionManager trans=new JpaTransactionManager();
		trans.setEntityManagerFactory(this.entityManagerFactory().getObject());
		return trans;		
	}
}
