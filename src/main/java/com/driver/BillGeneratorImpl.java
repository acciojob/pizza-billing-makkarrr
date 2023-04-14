package com.driver;

import java.util.List;

public class BillGeneratorImpl implements BillGenerator{
    @Override
    public String generateBill(Pizza pizza) {
        String bill = "Base Price of pizza: " + pizza.getBasePrice() + "\n";
        if(pizza.isCheeseAdded()) {
            bill += "Extra Cheese Added: " + pizza.getCheesePrice() + "\n";
        }
        if(pizza.isToppingAdded()) {
            bill += "Extra Toppings Added: " + pizza.getToppingPrice() + "\n";
        }
        if(pizza.isTakeAway()) {
            bill += "Paperbag Added:" + pizza.getTakeAwayPrice() + "\n";
        }
        bill += "Final price : " + pizza.getPrice();
        return bill;
    }
}
