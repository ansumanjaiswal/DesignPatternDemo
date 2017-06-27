package com.example.jaisw.designpatterntemplates.VisitorPattern;

/**
 * Created by jaisw on 3/14/2017.
 */

public class CardVisitorImplementation implements CardVisitor {

    @Override
    public void visit(RegularIdCard regularIdCard) {
        System.out.println("Visitor Pattern - Inside visit for SmartCard");
    }

    @Override
    public void visit(SmartCard smartCard) {
        System.out.println("Visitor Pattern - Inside visit for SmartCard");
    }

}
