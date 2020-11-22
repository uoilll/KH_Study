package com.oop.book.controller;

import com.oop.book.model.Book;

public class TestBook {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.bookInfomation();
		
		Book b2 = new Book("뇌를 자극하는 JAVA", 20000, 0.2, "김윤영");
		b2.bookInfomation();
		
		
		b1.setTitle("자바의 정석");
		b1.setPrice(35000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		b1.bookInfomation();

		int price1 = (int)(b1.getPrice() - (b1.getPrice() * b1.getDiscountRate()));
		int price2 = (int)(b2.getPrice() - (b2.getPrice() * b2.getDiscountRate()));
		
		System.out.printf("도서명: %s\n할인된가격: %d\n",b1.getTitle(),price1);
		System.out.printf("도서명: %s\n할인된가격: %d\n",b2.getTitle(),price2);
	}

}
