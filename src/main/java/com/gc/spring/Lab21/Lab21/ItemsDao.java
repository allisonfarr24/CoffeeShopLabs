package com.gc.spring.Lab21.Lab21;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Item> findAll() {
		String sql = "Select * FROM Items";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Item.class));
	}
	
	

}
