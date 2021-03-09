package com.tplus.gwland.rev.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class ReviewDto {
	private long revNum;
	private String revId;
	private String revStar;
	private String revContent;
	private String revDate;
}
