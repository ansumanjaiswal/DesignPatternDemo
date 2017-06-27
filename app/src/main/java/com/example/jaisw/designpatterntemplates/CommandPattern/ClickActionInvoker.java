package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class ClickActionInvoker {

    private Command command;

    public ClickActionInvoker(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
