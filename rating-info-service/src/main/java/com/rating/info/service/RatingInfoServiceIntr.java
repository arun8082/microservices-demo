package com.rating.info.service;

import java.util.List;

import com.rating.info.pojo.RatingInfo;

public interface RatingInfoServiceIntr {
	List<RatingInfo> getAllRatings() throws Exception;
}
