package com.wmz.di16;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
	
	@Test
	public void test01() {
		//从类路径中找xml文件，这里的配置文件存放在src下
		//加载spring配置文件，创建spring容器对象
		String resource = "/com/wmz/di16/applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
		//从容其中获取指定bean对象
		Student student = (Student) ac.getBean("student");
		Teacher teacher = (Teacher) ac.getBean("teacher");
		System.out.println(student);
		System.out.println(teacher);

	}
	
}
