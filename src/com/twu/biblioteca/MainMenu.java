package com.twu.biblioteca;

import sun.jvm.hotspot.oops.CellTypeStateList;

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
        this.mainMenu.add("ListBooks");
    }

    public List<String> GetMainMenu() {
        return this.mainMenu;
    }
}

