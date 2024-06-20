package Lesson2;

public class Actor {
    private String name;
    private Product product;

    public Actor(String name, Product product) {
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return name + " с продуктом: " + product;
    }
}