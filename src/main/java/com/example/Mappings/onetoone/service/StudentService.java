package com.example.Mappings.onetoone.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mappings.onetoone.dao.CategoryDAO;
import com.example.Mappings.onetoone.dao.ProductDAO;
import com.example.Mappings.onetoone.dao.StudentDAO;
import com.example.Mappings.onetoone.modal.Address;
import com.example.Mappings.onetoone.modal.Category;
import com.example.Mappings.onetoone.modal.Laptop;
import com.example.Mappings.onetoone.modal.Product;
import com.example.Mappings.onetoone.modal.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	public void create1()
	{
		Student student = new Student();
		 student.setStudentID(2);
		 student.setStudentName("Bablu");
		 student.setStudentEmail("abc@gmail.com");
		 
		 Laptop laptop = new Laptop();
		 laptop.setLaptopID(12);
		 laptop.setBrand("Mac");
		 laptop.setStudent(student);
		 
		 student.setLaptop(laptop);
		 
		 studentDAO.save(student);

	}
	
	
	public void create2()
	{
		 Student student = new Student();
		 student.setStudentID(3);
		 student.setStudentName("Shiva");
		 student.setStudentEmail("abc@gmail.com");
		 
		 Address address1 = new Address();
		 address1.setAddressID(1);
		 address1.setCountry("INDIA");
		 address1.setState("Telangana");
		 address1.setStudent(student);
		 
		 Address address2 = new Address();
		 address2.setAddressID(2);
		 address2.setCountry("INDIA");
		 address2.setState("AndhraPradesh");
		 address2.setStudent(student);
		 
		 List<Address>list = new ArrayList<>();
		 list.add(address1);
		 list.add(address2);
		 
		 student.setAddressList(list);
		 
		 studentDAO.save(student);
		 
	}
	
	public void create3()
	{
		Category category1 = new Category();
		category1.setCatId(1);
		category1.setCatName("Mobile");
		
		Category category2 = new Category();
		category2.setCatId(2);
		category2.setCatName("Electronics");
		
		Product product1 = new Product();
		product1.setProductId("pd1");
		product1.setProductName("iphone11");
		
		Product product2 = new Product();
		product2.setProductId("pd2");
		product2.setProductName("iphone12");
		
		Product product3 = new Product();
		product3.setProductId("pd3");
		product3.setProductName("iphone13");
		
		List<Product>cat1products =  category1.getProductList();
		cat1products.add(product1);
		cat1products.add(product2);
		cat1products.add(product3);
		
		List<Product>cat2products =  category2.getProductList();
		cat2products.add(product1);
		cat2products.add(product2);
		
		categoryDAO.save(category1);
		categoryDAO.save(category2);
	}
	
	public void fetch()
	{
		Category cat= categoryDAO.findById(1).get();
		System.out.println("Categories1 : productListSize :"+ cat.getProductList().size());
		
		Product product = productDAO.findById("pd1").get();
		System.out.println("Product1 : catListSize :"+ product.getCategoryList().size());
	}
}
