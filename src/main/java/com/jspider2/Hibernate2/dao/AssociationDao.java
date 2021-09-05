package com.jspider2.Hibernate2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider2.Hibernate2.entity.Brand;
import com.jspider2.Hibernate2.entity.College;
import com.jspider2.Hibernate2.entity.Model;
import com.jspider2.Hibernate2.entity.Person;
import com.jspider2.Hibernate2.entity.Students;

public class AssociationDao {

	
	public void savePersonDetails(Person person) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(person);
		transaction.commit();
		
		

	}

	public void saveBrandDetails(Brand brand) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(brand);
		transaction.commit();
	}
	public void saveStudentDetails(Students stu) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(stu);
		transaction.commit();
	}
}