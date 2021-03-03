package com.tplus.gwland.cli.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tplus.gwland.cli.domain.Client;
import com.tplus.gwland.cli.domain.ClientDto;



@Repository
public class ClientRepositoryImpl extends QuerydslRepositorySupport 
									implements IClientRepository{
	private final JPAQueryFactory qf;
	private final EntityManager em;
	
	public ClientRepositoryImpl(JPAQueryFactory qf, EntityManager em) {
		super(Client.class);
		this.qf = qf;
		this.em = em;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findBycliName(String cliName) {
		return em.createNamedQuery("Client.findByCliName")
				.setParameter("cliName", cliName)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findByfindBycliAge(String cliAge) {
		return em.createQuery("select b from Board b where b.cli_age like :cliAge")
				.setParameter("cliAge", cliAge)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ClientDto> findBycliNum(String cliNum) {
		return em.createQuery("")
				.setParameter("cliNum", cliNum)
				.getResultList();
	}
	

}
