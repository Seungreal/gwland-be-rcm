package com.tplus.gwland.sec.util;


import lombok.Builder;
import lombok.Getter;

interface AuthToken {
	String getToken();
}
@Builder
@Getter
public class CustomAuthToken implements AuthToken{
	private String token;
}
