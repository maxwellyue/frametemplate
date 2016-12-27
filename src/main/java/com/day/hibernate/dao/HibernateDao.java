package com.day.hibernate.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.day.hibernate.domain.User;

@Repository("hibernateDao")
public class HibernateDao extends HibernateDaoSupport{
	
	@Resource(name = "sessionFactory")
	public final void setHibernateSessionFactory(final SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	
	public void addData(){
		User user = new User();
		user.setName("史明辉");
		user.setPwd("123");
		this.getHibernateTemplate().saveOrUpdate(user);
		
	}
	
}
