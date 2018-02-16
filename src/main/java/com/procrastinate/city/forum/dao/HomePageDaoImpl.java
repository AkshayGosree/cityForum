package com.procrastinate.city.forum.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.procrastinate.city.forum.model.Topics;

@Repository("HomePageDao")
public class HomePageDaoImpl implements HomePageDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public List<Topics> returnHome() {
		Query query = getSession().createQuery("from Topics");
//		Query query = getSession().createSQLQuery(
//				"select * from Topics");
			List<Topics> result = query.list();
			return result;	
	}
}
