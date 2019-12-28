package chapter3.e3_13.SampleLink;

public class Link {
    private Node root;

    public void add(String data) {
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
    }
    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }
}
