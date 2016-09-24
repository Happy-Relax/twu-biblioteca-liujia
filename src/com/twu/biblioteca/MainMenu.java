package com.twu.biblioteca;

import sun.jvm.hotspot.oops.CellTypeStateList;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jiaLiu on 9/17/16.
 */
public class MainMenu {

    private List<String> mainMenu = new ArrayList<>();

    public MainMenu (){
        this.mainMenu.add("1.ListBooks");
        this.mainMenu.add("2.Checkout Book");
    }

    public List<String> GetMainMenuOptions() {
        return this.mainMenu;
    }

    public void chooseOptions(int mainOption, PrintStream printer, BookLibrary bookLibrary) throws IOException {
        switch (mainOption){
            case 1: listBooks(bookLibrary, printer); break;
            default: printer.print("Select a valid option!");
        }
    }

    public void showMainMenu(PrintStream printer) {
        for (int item = 0; item < this.mainMenu.size(); item++) {
            printer.print(this.mainMenu.get(item));
        }
    }

    private void listBooks(BookLibrary bookLibrary, PrintStream printer) {
        List<Book> allBooks = bookLibrary.getAllBooks();
        for (int index = 0; index < allBooks.size(); index++) {
            Book book = allBooks.get(index);
            printer.print("[number:" +book.bookNumber + "] "+book.bookName + " " + book.author + " " + book.yearPublishe);
        }
    }
}

