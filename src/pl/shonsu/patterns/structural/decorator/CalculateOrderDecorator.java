package pl.shonsu.patterns.structural.decorator;

class CalculateOrderDecorator implements CalculateOrder{

    private CalculateOrder orderWrappee;

    public CalculateOrderDecorator(CalculateOrder order) {
        this.orderWrappee = order;
    }

    @Override
    public void calculatePrice(Cart cart) {
        orderWrappee.calculatePrice(cart);
    }
}
