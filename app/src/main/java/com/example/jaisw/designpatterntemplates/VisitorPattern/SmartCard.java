package com.example.jaisw.designpatterntemplates.VisitorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class SmartCard implements Card {

    @Override
    public void accept(CardVisitor cardVisitor) {
        cardVisitor.visit(this);
    }
}
