package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class OpenNewActivityCommand implements Command {
    private final ClickActionReceiver clickActionReceiver;

    public OpenNewActivityCommand(ClickActionReceiver clickActionReceiver) {
        this.clickActionReceiver = clickActionReceiver;
    }

    @Override
    public void execute() {
        this.clickActionReceiver.openNewActivity();
    }
}
