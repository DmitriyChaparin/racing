package Product;

import java.util.Objects;
import java.util.Set;

public class Product {

    private final String product;
    private double cost;
    private double weight;


    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.weight = weight;
    }

    public Product(String product, double cost, double weight) {
       if (product == null || product.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else {
            this.product = product;
        }
        setCost(cost);
        setWeight(weight);
    }

    public void add(Set<Product> bag) {
        if (bag.contains(this)) {
            throw new IllegalArgumentException("Такой продукт уже добавлен");
        } bag.add(this);
    }

    public void remove(Set<Product> bag) {
        bag.remove(this);
    }


    @Override
    public String toString() {
        return "Продукт " + product +
                ". Цена:" + cost +
                ". Вес:" + weight +" кг.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);

    }


}
