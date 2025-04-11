package com.java8.lambdaex;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(101,"Head First Java", 1500));
		books.add(new Book(102,"Head First Design Patterns", 1600));
		books.add(new Book(103,"Head First Networking", 1800));
		books.add(new Book(104,"C++ Primer", 1200));

		return books;
	}
}
