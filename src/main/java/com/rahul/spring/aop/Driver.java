package com.rahul.spring.aop;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);
		
		EmpDao empDao = context.getBean(EmpDao.class);
		
		//boolean res = empDao.insertDataUsingPreparedStatement(new Emp(1,"1984-10-30","Rahul","Sahukar","M","2006-05-19"));
		//int res = empDao.updateData("Rahul");
		
		//List<Emp> empList = empDao.selectAllEmployees();
		List<Emp> empList = empDao.getAllEmployeesMapper();
		for(Emp emp: empList){
			System.out.println(emp.toString());
		}
		
		//System.out.println(res);

	}

}
