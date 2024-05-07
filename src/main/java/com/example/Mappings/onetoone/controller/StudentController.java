package com.example.Mappings.onetoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mappings.onetoone.dto.UserResp;
import com.example.Mappings.onetoone.modal.User;
import com.example.Mappings.onetoone.service.EmailService;
import com.example.Mappings.onetoone.service.PaginationService;
import com.example.Mappings.onetoone.service.StudentService;
import com.example.Mappings.onetoone.service.TransactionManagement;

@RestController
@RequestMapping("/mapping")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private PaginationService paginationService;
	
	@Autowired
	private TransactionManagement transactionManagement;
	
	@PostMapping("/create")
	public List<String> create()
	{
		//studentService.create1();
		
		//studentService.create2();
		
		//studentService.create3();
		
		//studentService.fetch();
		
		//emailService.sendSimpleMail();
	
		//transactionManagement.manageTransactions();
		return paginationService.getUsers();
	}
	
	@PostMapping("/paging")
	public List<UserResp> paging(@RequestParam int pageNo, @RequestParam int pageSize, @RequestParam String sortBy)
	{
		//return paginationService.getAllUsers(pageNo,pageSize,sortBy);
		
		return paginationService.getAllUsers(pageNo, pageSize, sortBy);
	}
}
