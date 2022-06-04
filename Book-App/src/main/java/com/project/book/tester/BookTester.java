package com.project.book.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.book.dao.BookDao;
import com.project.entity.*;

public class BookTester {
	public static void main(String[] args) {
		String springConfigFlie="applicationContext.xml";
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext(springConfigFlie);
		Book book=new Book();
		book.setName("HeadServlet");
		book.setNoOfPages(850);
		book.setPrice(1800);
		book.setHasGoodReviews(true);
		book.setAuthor("sharath");
		
		BookDao bookDao=springContainer.getBean(BookDao.class);
		bookDao.addBookEntityData(book);
		
		ClassPathXmlApplicationContext classpathxmlApplicationcontext=(ClassPathXmlApplicationContext) springContainer;
		classpathxmlApplicationcontext.close();
		
		
	}

}