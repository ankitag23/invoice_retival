package org.cust.dao;

import java.util.List;

import org.cust.model.Ban_archive;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Ban_Archive_Dao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf)
	{
		this.sessionFactory = sf;
	}
	
	public Ban_archive getBanArch(int ban_id) {
		Session session = this.sessionFactory.getCurrentSession();
		Ban_archive ban_arch = (Ban_archive) session.get(Ban_archive.class, new Integer(ban_id));
		return ban_arch;
	}
	public List<Ban_archive> getAllBans()
	{
		Session session = this.sessionFactory.getCurrentSession();
		List<Ban_archive> banArchList = session.createQuery("from Ban_archive").list();
		return banArchList;
	}
	
}
