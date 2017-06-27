package com.example.jaisw.designpatterntemplates.Mediator;

/**
 * Created by jaisw on 3/23/2017.
 */

public class StockMediator implements Mediator {


    @Override
    public void updatePriceOnSale(int price, Stock stock) {
        stock.setNewPrice(price);
    }
}
