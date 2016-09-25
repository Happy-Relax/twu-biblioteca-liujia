package com.twu.biblioteca;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaLiu on 9/17/16.
 */
public class MainMenu {

    private List<String> mainMenu = new ArrayList<>();

    public MainMenu (){
        this.mainMenu.add("1.ListBooks");
        this.mainMenu.add("2.Checkout Book");
    }

    public void chooseOptions(int mainOption, PrintStream printer, InputStreamReader acceptor, BookLibrary bookLibrary) throws IOException {
        switch (mainOption){
            case 1: bookLibrary.listBooks(printer); break;
            case 2: checkOutBooks(printer, acceptor, bookLibrary);break;
            default: printer.print("Select a valid option!");
        }
    }

    private void checkOutBooks(PrintStream printer, InputStreamReader acceptor, BookLibrary bookLibrary) throws IOException {
        printer.print("please input the book's number.");
        int bookNumber = acceptor.read();
        if(bookLibrary.checkOutBook(bookNumber)){
            printer.print("Thank you! Enjoy the book");
        } else {
            printer.print("That book is not available");
        }

    }

    public void showMainMenu(PrintStream printer) {
        for (int item = 0; item < this.mainMenu.size(); item++) {
            printer.print(this.mainMenu.get(item));
        }
    }

}

