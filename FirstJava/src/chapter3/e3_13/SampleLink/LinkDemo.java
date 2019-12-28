package chapter3.e3_13.SampleLink;

public class LinkDemo {
    public static void main(String[] args) {
        // 设置数据
        Node root = new Node("车头");
        Node n1 = new Node("车厢A");
        Node n2 = new Node("车厢B");
        // 设置关系
        root.setNext(n1);
        n1.setNext(n2);
        // 取出数据
        Node currentNode = root;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }

        Link link = new Link();
        link.add("Hello");
        link.add("World");
        link.add("!");
        link.print();

    }
}
