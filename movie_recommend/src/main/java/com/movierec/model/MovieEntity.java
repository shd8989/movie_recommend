package com.movierec.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MovieEntity {
	@JsonProperty
	private String title;
	@JsonProperty
	private int rating;
	@JsonProperty
	private int movieId;
	@JsonProperty
	private int avgRating;
}