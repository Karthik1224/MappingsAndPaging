package com.example.Mappings.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Mappings.onetoone.dao.PaymentDAO;
import com.example.Mappings.onetoone.dao.UserDAO;
import com.example.Mappings.onetoone.modal.User;
import com.example.Mappings.onetoone.modal.UserPayment;

import jakarta.transaction.Transactional;

@Service
public class TransactionManagement {

	@Autowired
	private UserDAO userDao;

	@Autowired
	private PaymentDAO paymentDao;

	@Transactional
	public void manageTransactions() {

		User user = new User();
		user.setUserID(12);
		user.setUserName("avinash");
		user.setSalary(1000);
		userDao.save(user);

		UserPayment payment = null;
		payment.setId(12);
		payment.setType("Debit");
		payment.setPrice("300");
		paymentDao.save(payment);

	}
}
