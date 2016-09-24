package com.twu.biblioteca;

import java.io.*;

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

        showMainMenu(this.mainMenu);

        int option = this.acceptor.read();
        while (option != 0){
            this.mainMenu.chooseOptions(option, printer, bookLibrary);
            showMainMenu(this.mainMenu);
            option = this.acceptor.read();
        }
        this.printer.print("See you");

    }

    private void showMainMenu(MainMenu mainMenu) {
        for (int option = 0; option < mainMenu.GetMainMenuOptions().size(); option++) {
            printer.print(mainMenu.GetMainMenuOptions().get(option));
        }
    }

    public String WelcomeMessage(){
        return "WelcomeMessage to Biblioteca";
    }

}
