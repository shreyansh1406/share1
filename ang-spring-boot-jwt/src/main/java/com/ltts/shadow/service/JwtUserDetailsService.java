package com.ltts.shadow.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ltts.shadow.Repositories.UserJPA;
import com.ltts.shadow.model.UserDTO;
import com.ltts.shadow.model.UsersLog;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	UserJPA ujpa;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			UsersLog u=ujpa.findByUsername(username);

		if (u.getUsername().equals(username)) {
			return new User(u.getUsername(), u.getPassword(),
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
	public UsersLog save(UserDTO user) {
		UsersLog newUser = new UsersLog();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return ujpa.save(newUser);
	}
}