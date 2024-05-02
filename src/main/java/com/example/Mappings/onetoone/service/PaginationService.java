package com.example.Mappings.onetoone.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Mappings.onetoone.dao.UserDAO;
import com.example.Mappings.onetoone.dto.UserResp;
import com.example.Mappings.onetoone.modal.User;

@Service
public class PaginationService {

	@Autowired
	private UserDAO userDAO;
	
	public List<UserResp> getAllUsers(int pageNo, int pageSize, String sortBy)
	{
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortBy).ascending());
		//Page<User> pagedResult = userDAO.findAll(pageable);
		
		Page<String> pagedResult = userDAO.getUserResponseData(pageable);
		
		//List<User>listOfUsers = pagedResult.getContent();
		//listOfUsers.stream().forEach(user -> System.out.println(user.getUserName() + " : "+user.getSalary()));
		
		List<UserResp> listOfUsers = new ArrayList<>();
		
		for (Object Obj : pagedResult.getContent()) {
			Object[] DetailsObject = (Object[]) Obj;
			String[] getvalues = new String[DetailsObject.length];
			for (int i = 0; i < DetailsObject.length; i++) {
				if (DetailsObject[i] != null) {
					getvalues[i] = String.valueOf(DetailsObject[i]);
				}
			}
			
			UserResp userResp = new UserResp(getvalues[0], getvalues[1]);
			listOfUsers.add(userResp);
		}
		
		return listOfUsers;
	}
}
