package com.example.Mappings.onetoone.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Mappings.onetoone.modal.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>{

	@Query(value = "SELECT user_name, salary from user_details", nativeQuery = true)
	public Page<String> getUserResponseData(Pageable pageable);
}
