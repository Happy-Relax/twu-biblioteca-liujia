package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaLiu on 9/24/16.
 */
public class BookLibrary {
    private List<String> books = new ArrayList<>();

    public BookLibrary(){
        this.books.add("allBooks");
    }

    public List<String> getAllBooks(){
        return this.books;
    }
}
