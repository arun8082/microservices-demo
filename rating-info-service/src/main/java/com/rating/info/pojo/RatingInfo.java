package com.rating.info.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RatingInfo {

	@NotNull(message = "Movie Id can't be empty")
	private Integer movieId;

	@NotNull(message = "Rating value can't be empty")
	@Min(value = 1, message = "Minimum rating value can 1")
	@Max(value = 10, message = "Maximum rating value can be 10")
	private Integer rating;

	public RatingInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RatingInfo(@NotNull(message = "Movie Id can't be empty") Integer movieId,
			@NotNull(message = "Rating value can't be empty") @Min(value = 1, message = "Minimum rating value can 1") @Max(value = 10, message = "Maximum rating value can be 10") Integer rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "RatingInfo [movieId=" + movieId + ", rating=" + rating + "]";
	}

}
