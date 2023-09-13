package pl.shonsu.patterns.structural.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>(List.of(
                new Item("item 1", 2, new BigDecimal("10")),
                new Item("item 2", 3, new BigDecimal("20")),
                new Item("item 3", 4, new BigDecimal("30"))
        ));
        Order order = new Order();
        CalculateOrderDecorator orderDecorator = new OrderDiscountDecorator(
                new CalculateOrderDecorator(new OrderLimitDecorator(order)));
        orderDecorator.calculatePrice(new Cart(items));
        order.cart.getItems().forEach(System.out::println);
        System.out.println(order.cart.getTotalPrice());
    }
}
