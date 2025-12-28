package LinkedList;

public class LinkedList {
    Node head;
    public void addFirst(Node node) {
        node.next = head;
        head = node ;
    }
	
    public void traverseNode() {
        Node current = head;
        while (current != null) {
            String name = current.name;
            System.out.println(name);
            current = current.next;
        }
    }

    public Node getLastNode(Node current){
	if(current.next==null){
	    return current;
	}else{
	   return getLastNode(current.next);
	}
	
    }

    public void addLast(Node node){
	Node lastNode = getLastNode(head);
	lastNode.next=node;
    }
}
