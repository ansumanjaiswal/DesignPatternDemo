package com.example.jaisw.designpatterntemplates.CommandPattern;

/**
 * Created by jaisw on 3/19/2017.
 */

public class CommandPatternDemo {

    public void demoCommandPattern(){
        ButtonClickActionReceiver receiver = new ButtonClickActionReceiver();
        ClickActionInvoker invoker;

        OpenNewActivityCommand openNewActivityCommand = new OpenNewActivityCommand(receiver);
        invoker = new ClickActionInvoker(openNewActivityCommand);
        invoker.execute();

        LoadNewFragmentCommand loadNewFragmentCommand = new LoadNewFragmentCommand(receiver);
        invoker = new ClickActionInvoker(loadNewFragmentCommand);
        invoker.execute();

        OpenBrowserCommand openBrowserCommand = new OpenBrowserCommand(receiver);
        invoker = new ClickActionInvoker(openBrowserCommand);
        invoker.execute();

        OpenPopUpCommand openPopUpCommand = new OpenPopUpCommand(receiver);
        invoker = new ClickActionInvoker(openPopUpCommand);
        invoker.execute();
    }
}
