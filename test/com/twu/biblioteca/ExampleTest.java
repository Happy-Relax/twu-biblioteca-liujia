package com.twu.biblioteca;


import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void Should_show_welcome_message() {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        assertEquals(bibliotecaApp.Welcome(),"Welcome to Biblioteca");
    }

    @Test
    public void Should_show_main_menu_options(){
        MainMenu mainMenu = new MainMenu();

        assertEquals(1, mainMenu.GetMainMenu().size());
        assertEquals("ListBooks", mainMenu.GetMainMenu().get(0));
    }

    @Test
    public void Should_show_all_books_when_choose_list_books_option(){
        

    }

}
