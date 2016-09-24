package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class bibliotecaTest {

    private PrintStream printer;
    private InputStreamReader accepto;
    @Before
    public void init(){
        printer = mock(PrintStream.class);
        accepto = mock(InputStreamReader.class);
    }

    @Test
    public void Should_show_welcome_message_and_mainMenu() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        bibliotecaApp.main();
        verify(printer).print("WelcomeMessage to Biblioteca");
        verify(printer).print("1.ListBooks");

    }


    @Test
    public void Should_show_all_books_when_choose_the_first_options() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(1);
        bibliotecaApp.main();
        verify(printer).print("allBooks");
    }

    @Test
    public void Should_show_all_books_when_choose_list_books_option() {


    }

}
