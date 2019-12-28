package chapter13.e13_3;

public class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(this.price);
        result = prime * result + (int)(temp^(temp >>> 32));
        result = prime * result + ((this.title == null)?0:title.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "书名：" + this.title + "，价格：" + this.price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(book.price)) {
            return false;
        }
        if (this.title == null) {
            return book.title == null;
        } else {
            return this.title.equals(book.title);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
