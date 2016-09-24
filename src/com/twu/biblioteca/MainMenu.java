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
    private List<Integer> validOptions = new ArrayList<>();

    public MainMenu (){
        this.mainMenu.add("1.ListBooks");
        this.validOptions.add(1);
    }

    public List<String> GetMainMenuOptions() {
        return this.mainMenu;
    }

    public void chooseOptions(int mainOption, PrintStream printer, BookLibrary bookLibrary) throws IOException {
        switch (mainOption){
            case 1: listBooks(bookLibrary, printer);
        }

    }

    private void listBooks(BookLibrary bookLibrary, PrintStream printer) {
        List<String> allBooks = bookLibrary.getAllBooks();
        for (int index = 0; index < allBooks.size(); index++) {
            printer.print(allBooks.get(index));
        }
    }
}

