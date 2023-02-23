package com.bogus.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bogus.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReview(@Param("id") int id);
}
