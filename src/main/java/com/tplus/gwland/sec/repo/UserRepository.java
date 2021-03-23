package com.tplus.gwland.sec.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tplus.gwland.sec.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	// SELECT * FROM user WHERE username = ?1
	User findByUsername(String username);
	
	// SELECT * FROM user WHERE provider = ?1 and providerId = ?2
	Optional<User> findByProviderAndProviderId(String provider, String providerId);
}


