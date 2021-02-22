package com.tplus.gwland.bbs.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {
	@Id private int bdNum;
	@Column(name="content") private String content;
	@Column(name="writer_id") private String writerId;
	@Column(name="reg_date") private String regDate;
}





