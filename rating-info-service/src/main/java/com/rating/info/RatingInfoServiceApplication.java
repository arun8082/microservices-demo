package com.rating.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.rating.info.pojo.RatingInfo;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class RatingInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingInfoServiceApplication.class, args);
	}

	@Bean
	List<RatingInfo> ratingsList() {
		return Arrays.asList(new RatingInfo(1, 4), new RatingInfo(2, 6), new RatingInfo(3, 10), new RatingInfo(4, 1),
				new RatingInfo(5, 4), new RatingInfo(6, 6), new RatingInfo(7, 10), new RatingInfo(8, 9),
				new RatingInfo(9, 3));
	}

}
