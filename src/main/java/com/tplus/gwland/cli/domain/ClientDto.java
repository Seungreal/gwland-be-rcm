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
	public String cliName; 
	public String cliGen; 
	public String cliMail; 
	public String cliAge;

}
// 메모리에 저장
