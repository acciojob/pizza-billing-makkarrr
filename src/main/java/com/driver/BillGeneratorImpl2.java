package com.driver;

public class BillGeneratorImpl2 implements BillGenerator{
    @Override
    public String generateBill(Pizza pizza) {
        String bill = "Base Price Of Deluxe Pizza: " + pizza.getBasePrice() + "\n";
        if(pizza.isTakeAway()) {
            bill += "Paperbag Added: " + pizza.getTakeAwayPrice() + "\n";
        }
        bill += "Total Price: " + pizza.getPrice() + "\n";
        return bill;
    }
}
