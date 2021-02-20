package com.tplus.gwland.bbs.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@Lazy
@NoArgsConstructor
public class Board {
	private int bdNum;
	private String content, writerId, regDate;
}