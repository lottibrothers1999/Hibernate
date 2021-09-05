package com.jspider2.Hibernate2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jspider2.Hibernate2.entity.Movie;

public class HqlMovieDao {

	public List<Movie> getMovies() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hqlQuery = "from Movie";
		Query query = session.createQuery(hqlQuery);
		return query.list();
	}
	
	public Movie getMovieById( int id) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hqlQuery = "from Movie where id=:i";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("i", id);
		return (Movie) query.uniqueResult();
	}
	
	public void updateMovieByName(String language, String movieName) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String hqlQuery = "update Movie set language=:l where name=:n";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("l", language);
		query.setParameter("n", movieName);
		query.executeUpdate();
		transaction.commit();
	}
	public void deleteMovieById(int id)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String hqlQuery="delete from Movie where id=:i";
		Query query=session.createQuery(hqlQuery);
		query.setParameter("i",id);
		query.executeUpdate();
		transaction.commit();
	}
}
