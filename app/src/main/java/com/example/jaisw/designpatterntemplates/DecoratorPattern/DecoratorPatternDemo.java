package com.example.jaisw.designpatterntemplates.DecoratorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class DecoratorPatternDemo {

    public void demoDecoratorPattern(){
        PhotoFrame metalFrame = new MetalFrame(new BasicPhotoFrame());
        metalFrame.assemble();

        PhotoFrame woodenFrame = new WoodenFrame(new BasicPhotoFrame());
        woodenFrame.assemble();

        PhotoFrame metalFrameWithGoldenBorder = new MetalFrame(new GoldenBorder(new BasicPhotoFrame()));
        metalFrameWithGoldenBorder.assemble();

        PhotoFrame woodenFrameWithGoldenBorder = new WoodenFrame(new GoldenBorder(new BasicPhotoFrame()));
        woodenFrameWithGoldenBorder.assemble();
    }
}
