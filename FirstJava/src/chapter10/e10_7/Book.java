package chapter10.e10_7;

public class Book implements Comparable<Book> {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Price: " + this.price + "\n";
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(this.price, o.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
