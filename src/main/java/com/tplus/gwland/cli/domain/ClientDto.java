package com.tplus.gwland.cli.domain;

import java.util.Collection;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Component @Lazy @Getter
public class ClientDto implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	private long cliNum; 
	private String cliId;
	private String cliName; 
	private String cliGen; 
	private String cliMail; 
	private String cliAge;
	
	private Collection<? extends GrantedAuthority> autoorities;
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}
	@Override
	public String getPassword() {
		return null;
	}
	@Override
	public String getUsername() {
		return null;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
	public ClientDto(long cliNum, String cliId, String cliGen, String cliAge,
			Collection<? extends GrantedAuthority> autoorities) {
		super();
		this.cliNum = cliNum;
		this.cliId = cliId;
		this.cliGen = cliGen;
		this.cliAge = cliAge;
		this.autoorities = autoorities;
	}

}
// 메모리에 저장

