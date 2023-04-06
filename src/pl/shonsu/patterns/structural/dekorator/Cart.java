package pl.shonsu.patterns.structural.dekorator;

import java.math.BigDecimal;
import java.util.List;

class Cart {
    private List<Item> items;
    private BigDecimal totalPrice;

    public Cart(List<Item> item) {
        this.items = item;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
}
