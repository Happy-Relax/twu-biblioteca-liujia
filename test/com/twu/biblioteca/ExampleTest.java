package com.twu.biblioteca;


import org.junit.Test;

import java.io.IOException;

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
        assertEquals();
    }


}
