class Node {
    String name;
    Node next;
}
public class Stack {
    static Node topMuttai;
    public void push(Node node){
	topMuttai.next = node;
	topMuttai = node;
    }
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
	Node node4 = new Node();
        topMuttai = node3;
        node1.name = "A";
        node2.name = "B";
        node3.name = "C";
	node4.name = "Last";
        node1.next = node2;
        node2.next = node3;

    }
}
