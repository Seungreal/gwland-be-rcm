package com.tplus.gwland.rev.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ReviewDto {
	private int revNum;
	private String reviewId;
	private String reviewTitle;
	private String reviewContent;
	private float reviewStar;
	
}
