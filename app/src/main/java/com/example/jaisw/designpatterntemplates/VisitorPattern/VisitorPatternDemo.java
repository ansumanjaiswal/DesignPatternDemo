package com.example.jaisw.designpatterntemplates.VisitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaisw on 3/14/2017.
 */

public class VisitorPatternDemo {

    private static List<Card> cardList;

    {
        cardList = new ArrayList<>();
        cardList.add(new RegularIdCard());
        cardList.add(new SmartCard());
        cardList.add(new RegularIdCard());
        cardList.add(new RegularIdCard());
        cardList.add(new SmartCard());
        cardList.add(new SmartCard());
    }

    public void demoVisitorPattern() {
        CardVisitorImplementation cardVisitor = new CardVisitorImplementation();
        for (Card card : cardList) {
            card.accept(cardVisitor);
        }
    }
}
