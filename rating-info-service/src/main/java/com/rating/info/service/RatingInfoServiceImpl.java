package com.rating.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.info.pojo.RatingInfo;

@Service
public class RatingInfoServiceImpl implements RatingInfoServiceIntr{

	@Autowired
	private List<RatingInfo> ratingList; 
	
	@Override
	public List<RatingInfo> getAllRatings() throws Exception {
		return ratingList;
	}

}
