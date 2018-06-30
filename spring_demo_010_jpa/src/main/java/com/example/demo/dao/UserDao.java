package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("update User u(username) values(?1)")
	void update(String username);

}
