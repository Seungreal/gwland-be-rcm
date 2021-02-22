package com.tplus.gwland.cli.domain;

import javax.persistence.Column;
import javax.persistence.Id;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Lazy
@Data
public class ClientDto {
	public int cliNum; 
	private String cliId;
	public String name; 
	public String gender; 
	public String phoneNum; 
	public String regDate;
}
// 메모리에 저장


/* create table Client(
	cli_num int auto_increment primary key,
	cli_id varchar(20),
	name varchar(10),
	gender varchar(10),
	phone_num varchar(20),
	reg_date varchar(20));
	*/

 
/* 테스트용 db에 저장한 고객데이터
 * insert into Client(cli_id, name, gender, phone_num, reg_date) 
 values ('suho12', '박수호', '남', '01012345678', '931120'); */