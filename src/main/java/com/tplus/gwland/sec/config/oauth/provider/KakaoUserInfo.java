package com.tplus.gwland.sec.config.oauth.provider;

import java.util.Map;

public class KakaoUserInfo implements OAuth2UserInfo{

	private Map<String, Object> attributes;
	
    public KakaoUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
	@Override
	public String getProviderId() {
        return String.valueOf(attributes.get("id"));
	}
    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

	@Override
	public String getProvider() {
		return "kakao";
	}
	@Override
	public String getAge() {
		return (String) attributes.get("age");
	}
	@Override
	public String getGender() {
		return (String) attributes.get("gender");
	}

}