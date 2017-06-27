package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class LoadNewFragmentCommand implements Command {

    private final ClickActionReceiver clickActionReceiver;

    public LoadNewFragmentCommand(ClickActionReceiver clickActionReceiver) {
        this.clickActionReceiver = clickActionReceiver;
    }

    @Override
    public void execute() {
        this.clickActionReceiver.loadNewFragment();
    }
}
