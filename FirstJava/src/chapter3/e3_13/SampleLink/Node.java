package chapter3.e3_13.SampleLink;

public class Node {
    private String data;
    private Node next;

    public Node() {}
    public Node(String data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }

    public void addNode(Node newNode) {
        if (this.next == null) {
            this.next = newNode;
        } else {
            this.next.addNode(newNode);
        }
    }

    public void printNode() {
        System.out.println(this.data);
        if (this.next != null) {
            this.next.printNode();
        }
    }
}
