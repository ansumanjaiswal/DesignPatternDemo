package com.example.jaisw.designpatterntemplates.Mediator;

/**
 * Created by jaisw on 3/23/2017.
 */

public class SomeStock extends Stock {

    public SomeStock(int price, Mediator mediator) {
        super(price, mediator);
    }

    @Override
    protected void setNewPrice(int price) {
        mediator.updatePriceOnSale();
    }
}
