package com.example.jaisw.designpatterntemplates.DecoratorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class MetalFrame extends FrameDecorator {

    public MetalFrame(PhotoFrame potoFrahme) {
        super(potoFrahme);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Decorator Pattern - Inside Metal Frame");
    }
}
