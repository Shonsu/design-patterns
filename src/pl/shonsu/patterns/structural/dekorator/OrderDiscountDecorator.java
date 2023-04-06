package pl.shonsu.patterns.structural.dekorator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class OrderDiscountDecorator extends CalculateOrderDecorator {

    private static final int DISCOUNT = 10;

    public OrderDiscountDecorator(CalculateOrderDecorator orderDecorator) {
        super(orderDecorator);
    }

    @Override
    public void calculatePrice(Cart cart) {
        super.calculatePrice(calculateDiscount(cart));
    }

    private Cart calculateDiscount(Cart cart) {
        System.out.println("Calculate discount");
        cart.getItems()
                .forEach(item ->item.setPrice(item.getPrice().subtract(item.getPrice().divide(BigDecimal.valueOf(DISCOUNT), RoundingMode.HALF_EVEN))));
        return cart;
    }
}
