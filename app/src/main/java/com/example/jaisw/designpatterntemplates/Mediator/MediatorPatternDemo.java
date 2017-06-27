package com.example.jaisw.designpatterntemplates.Mediator;

/**
 * Created by jaisw on 3/23/2017.
 */

public class MediatorPatternDemo {

    public void demoMediatorPattern(){
        Mediator stockMediator = new StockMediator();
        Stock someStock = new SomeStock(10, stockMediator);
        Stock someStock1 = new SomeStock(10, stockMediator);
        stockMediator.updatePriceOnSale(9, someStock);
        stockMediator.updatePriceOnSale(9,someStock1);
    }
}
