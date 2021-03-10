package com.tplus.gwland.cli.domain;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

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
	private String password;
	
	private Collection<? extends GrantedAuthority> autoorities;
	public ClientDto(long cliNum, String cliId, String cliGen, String cliAge,
			String cliName, String password)
			/*
			 * Collection<? extends GrantedAuthority> autoorities)
			 */ 
			{
		this.cliNum = cliNum;
		this.cliId = cliId;
		this.cliGen = cliGen;
		this.cliAge = cliAge;
		this.cliName = cliName;
		this.password = password;
		//this.autoorities = autoorities;
	}
	
	public static ClientDto create(Client client) {
		//List<GrantedAuthority> authorities = 
		//		client.getRoles().stream()
		//		.map(role -> new SimpleGrantedAuthority(role.getRoleName().name()))
		//		.collect(Collectors.toList());
		return new ClientDto(client.getCliNum(), client.getCliId(), client.getCliGen(),
				client.getCliAge(),client.getCliName(),client.getCliPassword());
	}
	
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ClientDto that = (ClientDto) o;
		return Objects.equals(cliNum, that.cliNum);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cliNum);
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}


}

