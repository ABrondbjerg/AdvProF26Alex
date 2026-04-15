package searchandsort.entities;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private int id;
    private double price;

    public Product(String name, int id, double price) {
        this.name  = name;
        this.id    = id;
        this.price = price;
    }

    public int getId()       { return id; }
    public String getName()  { return name; }
    public double getPrice() { return price; }
    public void setId(int id){ this.id = id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product p = (Product) o;
        return id == p.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', id=" + id + ", price=" + price + "}";
    }
}