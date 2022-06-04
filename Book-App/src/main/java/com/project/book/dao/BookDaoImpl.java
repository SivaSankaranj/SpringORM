package com.project.book.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.entity.Book;
@Component
public class BookDaoImpl implements BookDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public BookDaoImpl() {
		System.out.println("Object is created: "+this.getClass().getSimpleName());
	}

	@Override
	public void addBookEntityData(Book book) {
	System.out.println("involked add bus entity method,,,,,,,,,,, ");
	Session session=null;
	try {
		session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		System.out.println("Book data is sucessfully saved");
	}
	catch(HibernateException e) {
		System.out.println("inside catch block exception");
	    System.out.println(e.getMessage());
//		e.getMessage();
		session.getTransaction().rollback();
	}
	finally {
		if(session!=null) {
			System.out.println("session is closed");
			session.close();
		}
		else {
			System.out.println("session is not closed,,,,,,,,,,,");
			
		}
	}

	}

}
