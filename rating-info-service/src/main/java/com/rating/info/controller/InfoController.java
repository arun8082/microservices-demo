package com.rating.info.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.info.pojo.RatingInfo;
import com.rating.info.service.RatingInfoServiceIntr;

@RestController
@RequestMapping("/rating-info-service")
public class InfoController {

	@Value("${info}")
	private String info;
	
	@Autowired
	private RatingInfoServiceIntr ratinginfoService;
	
	@GetMapping("/info")
	public String getInfo() {
		return info;
	}
	
	@GetMapping("/ratingList")
	public List<RatingInfo> getAllRatingsInfo() throws Exception{
		return ratinginfoService.getAllRatings();
	}
	
}
