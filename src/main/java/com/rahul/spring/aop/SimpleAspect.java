package com.rahul.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
public class SimpleAspect {
	
	@Before("execution(* get*(..))")
	public void insertEmployee(){
		System.out.println("In Insert Employee aspect...");
	}

}
