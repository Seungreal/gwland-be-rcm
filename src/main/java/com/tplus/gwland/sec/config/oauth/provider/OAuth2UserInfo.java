package com.tplus.gwland.sec.config.oauth.provider;

public interface OAuth2UserInfo {
	String getProviderId();
	String getProvider();
	String getEmail();
	String getName();
	String getAge();
	String getGender();
}

