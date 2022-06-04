package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc",strategy = "increment")
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "NOOFPAGES")
	private int NoOfPages;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "HASGOODREVIEWS")
	private boolean hasGoodReviews;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, int noOfPages, double price, boolean hasGoodReviews) {
		super();
		this.name = name;
		this.author = author;
		NoOfPages = noOfPages;
		this.price = price;
		this.hasGoodReviews = hasGoodReviews;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfPages() {
		return NoOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		NoOfPages = noOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isHasGoodReviews() {
		return hasGoodReviews;
	}

	public void setHasGoodReviews(boolean hasGoodReviews) {
		this.hasGoodReviews = hasGoodReviews;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", NoOfPages=" + NoOfPages + ", price=" + price
				+ ", hasGoodReviews=" + hasGoodReviews + "]";
	}
	
	

}
