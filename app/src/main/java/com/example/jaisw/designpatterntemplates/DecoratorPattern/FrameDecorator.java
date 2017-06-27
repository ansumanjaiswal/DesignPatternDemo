package com.example.jaisw.designpatterntemplates.DecoratorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class FrameDecorator implements PhotoFrame {

    protected PhotoFrame photoFrame;

    public FrameDecorator(PhotoFrame photoFrame) {
        this.photoFrame = photoFrame;
    }

    @Override
    public void assemble() {
        System.out.println("Decorator Pattern - Inside Frame Decorator");
    }
}
