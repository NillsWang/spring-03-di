package com.wmz.di04;

public class Student {
	
	private String name;
	private int age;
	private School school;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("==============");
	}

	public Student(String name, int age, School school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + "]";
	}
	
	

}
