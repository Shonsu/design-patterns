package pl.shonsu.patterns.structural.decorator;

import java.math.BigDecimal;

class Order implements CalculateOrder {

    Cart cart;

    public Order() {
    }

    @Override
    public void calculatePrice(Cart cart) {
        System.out.println("Calculate Price");
        this.cart = calculate(cart);
    }

    private Cart calculate(Cart cart) {
        cart.getItems()
                .forEach(item -> item.setTotalPrice(
                        item.getPrice().multiply(BigDecimal.valueOf(item.getCount()))));
        cart.setTotalPrice(
                cart.getItems().stream()
                        .map(Item::getTotalPrice)
                        .reduce(BigDecimal.ZERO, BigDecimal::add));
        return cart;
    }

}
