package com.twu.biblioteca;

import org.mockito.InOrder;

/**
 * Created by jiaLiu on 9/24/16.
 */
public class Book {
    public Integer bookNumber;
    public String bookName;
    public String author;
    public String yearPublishe;
    public boolean hide = false;

    public Book(Integer bookNumber, String bookName, String author, String year) {
        this.bookNumber = bookNumber;
        this.bookName = bookName;
        this.author = author;
        this.yearPublishe = year;
    }
}
