package com.tplus.gwland.cli.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.tplus.gwland.cli.domain.Client;

@Repository
public class ClientRepositoryImpl extends QuerydslRepositorySupport 
									implements ClientCustomRepository{
  //private final JPAQueryFactory qf;
	public ClientRepositoryImpl() {
				super(Client.class);
				//this.qf = qf;
				}
			}
