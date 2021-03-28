package com.tplus.gwland.sec.config.oauth;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tplus.gwland.sec.config.auth.PrincipalDetails;
import com.tplus.gwland.sec.config.oauth.provider.KakaoUserInfo;
import com.tplus.gwland.sec.config.oauth.provider.GoogleUserInfo;
import com.tplus.gwland.sec.config.oauth.provider.NaverUserInfo;
import com.tplus.gwland.sec.config.oauth.provider.OAuth2UserInfo;
import com.tplus.gwland.usr.domian.User;
import com.tplus.gwland.usr.repository.UserRepository;



@Controller
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2User oAuth2User = super.loadUser(userRequest); 
		System.out.println("userRequest clientRegistration : " + userRequest.getClientRegistration());
		System.out.println("oAuth2User : " + oAuth2User);
	
		return processOAuth2User(userRequest, oAuth2User);
	}
	
	private OAuth2User processOAuth2User(OAuth2UserRequest userRequest, OAuth2User oAuth2User) {
		OAuth2UserInfo oAuth2UserInfo = null;
		String registrationId = userRequest.getClientRegistration().getRegistrationId();
		switch(registrationId) {
			case "google": oAuth2UserInfo = new GoogleUserInfo(oAuth2User.getAttributes()); break;
			case "kakao": oAuth2UserInfo = new KakaoUserInfo((Map)oAuth2User.getAttributes()); break;
			case "naver":oAuth2UserInfo = new NaverUserInfo((Map)oAuth2User.getAttributes().get("response")); break;
			default: System.out.println("해당사항 없음");
		}
		
		Optional<User> userOptional = 
				userRepository.findByProviderAndProviderId(oAuth2UserInfo.getProvider(), oAuth2UserInfo.getProviderId());
		
		User user;
		if (userOptional.isPresent()) {
			user = userOptional.get();
			// user가 존재하면 update 해주기
			user.setEmail(oAuth2UserInfo.getEmail());
			
			userRepository.save(user);
		} else {
			// user의 패스워드가 null이기 때문에 OAuth 유저는 일반적인 로그인을 할 수 없음.
			user = User.builder()
					.username(oAuth2UserInfo.getUsername())
					.email(oAuth2UserInfo.getEmail())
					.role("USER")
					.provider(oAuth2UserInfo.getProvider())
					.providerId(oAuth2UserInfo.getProviderId())
					.age(oAuth2UserInfo.getAge())
					.gender(oAuth2UserInfo.getGender())
					.build();
			userRepository.save(user);
		}

		return new PrincipalDetails(user, oAuth2User.getAttributes());
	}
}