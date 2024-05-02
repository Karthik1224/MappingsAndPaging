package com.example.Mappings.onetoone.dto;

public class UserResp {
 
	private String name;
	
	private String salary;

	public UserResp() {
		super();
	}

	public UserResp(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
}
