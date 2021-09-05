package com.jspider2.Hibernate2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider2.Hibernate2.dto.MovieDto;
import com.jspider2.Hibernate2.entity.Movie;

public class MovieDao {
	
	
	public void saveMovieDetails(Movie movie) {	
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(movie);
		transaction.commit();		
	}
	
	
	public Movie getMovieById(int id) {		
		//logic to fetch data
		Configuration cfg = new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(Movie.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(Movie.class, id);
	}
	
	public void updateMovieById(MovieDto movieDto, int id) {
		Movie movieFromDb = getMovieById(id);
		if(movieFromDb != null) {
			// update logic
			Configuration cfg = new Configuration();
			cfg.configure();
			//cfg.addAnnotatedClass(Movie.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			movieFromDb.setPrice(movieDto.getPrice());
			movieFromDb.setRatings(movieDto.getRatings());
			session.merge(movieFromDb);
			transaction.commit();
		}else {
			System.out.println("Update Failure");
		}
	}
	
	public void deleteById(int id) {	
		//logic to delete data
	}
	
}
