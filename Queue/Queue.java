package Queue;

public class Queue {
    class Node{
	String name;
	Node next;
	public Node(String name){
	    this.name = name;
	}
    public Node(){}
    }
    Node first;
    Node last;
    public void enqueue(Node newNode){
	if (this.first == null){
	   this.first = newNode;
	   this.last = newNode;
	}else{
	    this.last.next = newNode;
	    this.last = newNode;
	}
    }
    public Node dequeue(){
	if(this.first == null){
	    return null;
	}else if(this.first.next == null){
	    Node removed = this.first;
	    this.first = null;
	    this.last = null;
	    return removed;
	}else{
        Node removed = this.first;
	    this.first = removed.next;
	    return removed;
	}
    }
    public void traverseQueue(){
    Node current = this.first; 
    while(current != null){
        System.out.println(current.name);
        current = current.next;
    }
    }
    public static void main(String[] args){
	Queue waterLine = new Queue();
    Queue.Node str = waterLine.new Node("Kanishk");
	Queue.Node str2 = waterLine.new Node("Chittapa");
	Queue.Node str3 = waterLine.new Node("Daddy");
	Queue.Node str4 = waterLine.new Node("Mommy");
	Queue.Node str5 = waterLine.new Node("Chitta");
	Queue.Node str6 = waterLine.new Node("Gahana");
	str.next = str2;
	str2.next = str3;
	str3.next = str4;
	str4.next = str5;
    waterLine.first = str;
	waterLine.last = str5;
	waterLine.enqueue(str6);
    waterLine.traverseQueue();
	System.out.println("Removed : " + waterLine.dequeue().name);
    waterLine.traverseQueue(); 
    }

}
/*
123456
*/