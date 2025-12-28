package LinkedList;

public class Node {
    String name;
    Node next;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node0 = new Node();
	Node node4 = new Node();
        list.head = node1;
        node1.name = "A";
        node2.name = "B";
        node3.name = "C";
        node0.name = "Start";
	node4.name = "Last";
        node1.next = node2;
        node2.next = node3;
        list.addFirst(node0);
        list.traverseNode();
	System.out.println(list.getLastNode(list.head));
	list.addLast(node4);
	list.traverseNode();
    }
}
