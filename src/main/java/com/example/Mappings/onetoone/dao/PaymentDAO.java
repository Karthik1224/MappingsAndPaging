package com.example.Mappings.onetoone.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Mappings.onetoone.modal.UserPayment;

@Repository
public interface PaymentDAO extends JpaRepository<UserPayment, Integer>{

}
