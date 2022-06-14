package com.cg.dao;

import java.util.List;

import com.cg.entites.Book;


public interface BookDao 
{
	
	public abstract List<Book> getBookByTitle(String title);
	public abstract Long getBookCount();
	public abstract List<Book> getAuthorBooks(String author);
	public abstract List<Book>getAllBooks();
	public abstract List<Book> getBooksInPriceRange(double low ,double high);
	public abstract Book getBookById(int id);
	

}