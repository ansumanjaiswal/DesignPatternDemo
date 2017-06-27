package com.example.jaisw.designpatterntemplates.DecoratorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class WoodenFrame extends FrameDecorator {

    public WoodenFrame(PhotoFrame photoFrame) {
        super(photoFrame);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Decorator Pattern - Inside Wooden Frame");
    }
}
