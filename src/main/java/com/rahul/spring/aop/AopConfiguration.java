package com.rahul.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableAspectJAutoProxy
public class AopConfiguration {
	
	@Bean
	public DriverManagerDataSource getDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/employees");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}

	@Bean
	public EmpDao getEmpDao(){
		return new EmpDao();
	}
	
	@Bean
	public SimpleAspect getSimpleAspect(){
		return new SimpleAspect();
	}
}
