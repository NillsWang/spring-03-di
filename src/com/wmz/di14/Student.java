package com.wmz.di14;

public class Student {
	
	private String name;
	private int age;
	private String school;
	private String dapartment;
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", school=" + school + ", dapartment=" + dapartment + "]";
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDapartment() {
		return dapartment;
	}
	public void setDapartment(String dapartment) {
		this.dapartment = dapartment;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("=================");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("=================");
		this.age = age;
	}
	
	

}
