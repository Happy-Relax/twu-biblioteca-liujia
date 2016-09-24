package com.twu.biblioteca;

import java.io.*;
import java.util.List;

public class BibliotecaApp {

    private final PrintStream printer;
    private final InputStreamReader acceptor;
    private MainMenu mainMenu = new MainMenu();


    public BibliotecaApp(PrintStream printer, InputStreamReader acceptor) {
        this.printer = printer;
        this.acceptor = acceptor;
    }

    public void main() throws IOException {

        this.printer.print(this.WelcomeMessage());

        showMainMenu(this.mainMenu);

        int mainOption = this.acceptor.read();


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
