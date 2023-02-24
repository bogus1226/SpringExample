package com.bogus.spring.ex.mybatis.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bogus.spring.ex.mybatis.dao.ReviewDAO;
import com.bogus.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// 전달 받은 id가 일치하는 데이터 조회후 그 결과 리턴
	public Review getReview(int id) {
		
	 	Review review = reviewDAO.selectReview(id);
	 	
	 	return review;
	}
	
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
	}
	
	public int addReviewByObject(Review review) {
	 	return reviewDAO.insertReviewByObject(review);
	}
	
}
