package com.example.DemoProjectForDeployment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
	UserRepo userRepo;
    
    List<UserEntity>getall()
    {
    	List<UserEntity> all = userRepo.findAll();
    	return all;
    }
    
   UserEntity createUser(UserEntity user)
   {
	   UserEntity saved = userRepo.save(user);
	   return saved;
   }
}
