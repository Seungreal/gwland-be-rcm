package com.tplus.gwland.sec.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// ORM - Object Relation Mapping

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	private String username;
	private String password;
	private String email;
	private String role; 
	// OAuth를 위해 구성한 추가 필드 2개
	private String provider;
	private String providerId;
	private String age;
	private String gender;
	
	@CreationTimestamp
	private Timestamp createDate;
}