package com.example.Mappings.onetoone.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Laptop")
public class Laptop {

	@Id
	private int laptopID;
	
	private String brand;
	
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;

	public int getLaptopID() {
		return laptopID;
	}

	public void setLaptopID(int laptopID) {
		this.laptopID = laptopID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
