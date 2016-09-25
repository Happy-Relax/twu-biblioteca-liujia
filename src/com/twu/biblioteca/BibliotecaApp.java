package com.twu.biblioteca;

import java.io.*;
import java.util.List;

public class BibliotecaApp {

    private final PrintStream printer;
    private final InputStreamReader acceptor;
    private MainMenu mainMenu = new MainMenu();
    private BookLibrary bookLibrary = new BookLibrary();


    public BibliotecaApp(PrintStream printer, InputStreamReader acceptor) {
        this.printer = printer;
        this.acceptor = acceptor;
    }

    public void main() throws IOException {

        this.printer.print(this.WelcomeMessage());

        this.mainMenu.showMainMenu(this.printer);

        int option = this.acceptor.read();
        while (option != 0){
            this.mainMenu.chooseOptions(option, printer,acceptor, bookLibrary);
            this.mainMenu.showMainMenu(this.printer);
            option = this.acceptor.read();
        }
        this.printer.print("See you");

    }

    public String WelcomeMessage(){
        return "WelcomeMessage to Biblioteca";
    }

}
