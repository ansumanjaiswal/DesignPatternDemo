package com.example.jaisw.designpatterntemplates.Mediator;

/**
 * Created by jaisw on 3/23/2017.
 */

public abstract class Stock {

    protected int price;
    protected Mediator mediator;

    public Stock(int price, Mediator mediator) {
        this.price = price;
        this.mediator = mediator;
    }

    protected abstract void setNewPrice(int price);
}
