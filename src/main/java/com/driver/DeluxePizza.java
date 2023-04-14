package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here
    }

    public DeluxePizza(Boolean isVeg, BillGenerator billGenerator) {
        super(isVeg, billGenerator);
        super.addExtraToppings();
        super.addExtraCheese();
        super.vegPizzaBasePrice = super.vegPizzaBasePrice + super.getCheesePrice() + super.getToppingPrice();
        super.nonVegPizzaBasePrice = super.nonVegPizzaBasePrice + super.getCheesePrice() + super.getToppingPrice();
    }
}
