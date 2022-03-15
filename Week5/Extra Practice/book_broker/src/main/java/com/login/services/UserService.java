package com.login.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.login.models.LoginUser;
import com.login.models.User;
import com.login.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public void validate(User newUser, BindingResult errors) {
		// check email duplicate
		if(userRepo.findByEmail(newUser.getEmail()) != null) {
			errors.rejectValue("email", "unique", "Email is already taken!");
		}
		
		//password matching
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "mismatch", "Password does not match");
		}
	}
	
	public User registerUser(User newUser) {
		String hashedPass = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashedPass);
		newUser = userRepo.save(newUser);
		return newUser;
	}
	
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public User authenticateUser(LoginUser newLogin, Errors errors) {
		//find the user by email
		User user = userRepo.findByEmail(newLogin.getEmail());

		if (user == null) {
			errors.rejectValue("email", "missingEmail", "Email not found!");
			return null;
		} else {
			if (!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
				errors.rejectValue("password", "missmatch", "Invalid password");
				return null;
			}
		}
		return user;
		
	}
}
