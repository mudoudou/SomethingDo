package com.pan.test;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pan.service.StudentService;

public class TestMyBatis {
	
	private ApplicationContext ac = null; 
	
	@Resource  
    private StudentService studentService = null;  
	@Before
	public void before() {  
      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
      studentService = (StudentService) ac.getBean("studentService");  
  }  
	@Test
	public void test1() throws Exception{
		System.out.println(studentService.liStudents().get(0).getName());
	}
	
}