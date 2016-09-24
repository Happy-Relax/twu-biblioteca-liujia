package com.twu.biblioteca;

import java.io.PrintStream;
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

    public void listBooks(PrintStream printer) {
        for (int index = 0; index < this.books.size(); index++) {
            Book book = this.books.get(index);
            printer.print("[number:" +book.bookNumber + "] "+book.bookName + " " + book.author + " " + book.yearPublishe);
        }
    }
}
