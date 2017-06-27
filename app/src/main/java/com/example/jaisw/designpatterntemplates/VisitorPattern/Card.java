package com.example.jaisw.designpatterntemplates.VisitorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public interface Card {

    void accept(CardVisitor cardVisitor);
}
