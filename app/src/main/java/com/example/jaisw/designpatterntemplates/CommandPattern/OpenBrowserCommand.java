package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class OpenBrowserCommand implements Command {

    private final ClickActionReceiver clickActionReceiver;

    public OpenBrowserCommand(ClickActionReceiver clickActionReceiver) {
        this.clickActionReceiver = clickActionReceiver;
    }

    @Override
    public void execute() {
        this.clickActionReceiver.openBrowser();
    }
}
