package com.bogus.spring.ex.jsp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bogus.spring.ex.jsp.model.User;

@Repository
public interface UserDAO {

	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce);
	
	public int insertUserByObject(User user);
	
	public User selectLastUser();
	
	public List<User> selectUserList();
	
	public int selectCountEmail(@Param("email") String email);
	
}
