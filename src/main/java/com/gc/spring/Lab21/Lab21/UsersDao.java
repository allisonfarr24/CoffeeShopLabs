package com.gc.spring.Lab21.Lab21;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		String sql = "Select * FROM Users";

		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Person.class));
	}

	public void addUser(Person p) {
		String sql = "INSERT INTO Users (firstName, lastName, email, phoneNum, password) VALUES (?,?,?,?,?)";

		jdbcTemplate.update(sql, p.getFirstName(), p.getLastName(), p.getEmail(), p.getPhoneNum(), p.getPassword());
	}

}
