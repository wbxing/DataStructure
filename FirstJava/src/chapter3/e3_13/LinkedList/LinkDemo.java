package chapter3.e3_13.LinkedList;

public class LinkDemo {
    public static void main(String[] args) {
        Link link = new Link();
        link.add(new Book("Java", 89.9));
        link.add(new Book("Jsp", 79.9));
        link.add(new Book("Android", 99.9));
        System.out.println("保存的书的数量：" + link.size());
        System.out.println(link.contains(new Book("Java", 89.9)));
        link.remove(new Book("Android", 99.9));
        Object [] books = link.toArray();
        for (Object b : books) {
            Book book = (Book) b;
            System.out.println(book.getInfo());
        }
    }
}
