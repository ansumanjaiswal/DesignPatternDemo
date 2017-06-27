package com.example.jaisw.designpatterntemplates.DecoratorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class BasicPhotoFrame implements PhotoFrame {
    @Override
    public void assemble() {
        System.out.println("Decorator Pattern - Inside Basic Frame Decorator");
    }
}
