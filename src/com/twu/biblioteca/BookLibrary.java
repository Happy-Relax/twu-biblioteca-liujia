package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaLiu on 9/24/16.
 */
public class BookLibrary {
    private List<Book> books = new ArrayList<>();

    public BookLibrary(){
        this.books.add(new Book(1, "bookOne", "author", "year"));
    }

    public List<Book> getAllBooks(){
        return this.books;
    }
}
