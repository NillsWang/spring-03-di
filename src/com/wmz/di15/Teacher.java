package com.wmz.di15;

public class Teacher {
	
	private String name;
	private int workage;
	private String school;
	private String dapartment;
	
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", workage=" + workage + ", school=" + school + ", dapartment=" + dapartment + "]";
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
	public int getWorkage() {
		return workage;
	}
	public void setWorkage(int workage) {
		this.workage = workage;
	}
	
}
