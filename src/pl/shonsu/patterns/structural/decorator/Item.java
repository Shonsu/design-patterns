package pl.shonsu.patterns.structural.decorator;

import java.math.BigDecimal;

class Item{
    private String label;
    private int count;
    private BigDecimal price;
    private BigDecimal totalPrice;

    public Item(String label, int count, BigDecimal price) {
        this.label = label;
        this.count = count;
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "label='" + label + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
