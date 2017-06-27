package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class ButtonClickActionReceiver implements ClickActionReceiver {

    @Override
    public void openNewActivity() {
        System.out.println("Command Pattern : ButtonClickActionReceiver openNewActivity");
    }

    @Override
    public void loadNewFragment() {
        System.out.println("Command Pattern : ButtonClickActionReceiver loadNewFragment");
    }

    @Override
    public void openBrowser() {
        System.out.println("Command Pattern : ButtonClickActionReceiver openBrowser");
    }

    @Override
    public void openPopUp() {
        System.out.println("Command Pattern : ButtonClickActionReceiver openPopUp");
    }
}
