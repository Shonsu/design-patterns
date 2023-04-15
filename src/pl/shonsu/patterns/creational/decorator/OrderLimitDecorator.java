package pl.shonsu.patterns.creational.decorator;

class OrderLimitDecorator extends CalculateOrderDecorator {
    public OrderLimitDecorator(CalculateOrder order) {
        super(order);
    }

    @Override
    public void calculatePrice(Cart cart) {
        super.calculatePrice(checkItemsLimit(cart));
    }

    private Cart checkItemsLimit(Cart cart) {
        cart.getItems().stream().filter(item -> item.getCount() > 2).forEach(item -> item.setCount(2));
        return cart;
    }
}
