package chapter3.e3_13.LinkedList;

public class Book {
    public String title;
    public double price;

    public Book() {}
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean compare(Book book) {
        if (book == null) {
            return false;
        }
        if (this == book){
            return true;
        }
        return this.title.equals(book.title) && this.price == book.price;
    }

    public String getInfo() {
        return "图书名称：" + title + "，价格：" + price;
    }
}
