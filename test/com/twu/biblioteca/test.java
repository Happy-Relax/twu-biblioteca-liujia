package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.*;
import java.nio.CharBuffer;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class test {

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
        when(accepto.read()).thenReturn(0);
        bibliotecaApp.main();
        InOrder inOrder = inOrder(printer);
        inOrder.verify(printer).print("WelcomeMessage to Biblioteca");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
    }


    @Test
    public void Should_show_all_books_as_right_form_when_choose_the_first_options() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(1).thenReturn(0);
        bibliotecaApp.main();
        verify(printer).print("[number:1] bookOne author year");
        verify(printer).print("[number:2] bookTwo author year");
    }

    @Test
    public void Should_return_error_message_when_choose_a_invalid_option() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(100).thenReturn(0);
        bibliotecaApp.main();
        verify(printer).print("Select a valid option!");
    }

    @Test
    public void Should_close_app_when_choose_quit() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(1).thenReturn(0);
        bibliotecaApp.main();
        InOrder inOrder = inOrder(printer);
        inOrder.verify(printer).print("WelcomeMessage to Biblioteca");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
        inOrder.verify(printer).print("[number:1] bookOne author year");
        inOrder.verify(printer).print("[number:2] bookTwo author year");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
        inOrder.verify(printer).print("See you");
    }

    @Test
    public void Should_can_checkout_book_and_hide_the_book() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(2).thenReturn(1).thenReturn(1).thenReturn(0);
        bibliotecaApp.main();
        InOrder inOrder = inOrder(printer);
        inOrder.verify(printer).print("WelcomeMessage to Biblioteca");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
        inOrder.verify(printer).print("please input the book's number.");
        inOrder.verify(printer).print("Thank you! Enjoy the book");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
        inOrder.verify(printer).print("[number:2] bookTwo author year");
    }


    @Test
    public void Should_give_error_message_when_checkout_a_invalid_book() throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp(printer,accepto);
        when(accepto.read()).thenReturn(2).thenReturn(3).thenReturn(0);
        bibliotecaApp.main();
        InOrder inOrder = inOrder(printer);
        inOrder.verify(printer).print("WelcomeMessage to Biblioteca");
        inOrder.verify(printer).print("1.ListBooks");
        inOrder.verify(printer).print("2.Checkout Book");
        inOrder.verify(printer).print("please input the book's number.");
        inOrder.verify(printer).print("That book is not available");
    }
}
