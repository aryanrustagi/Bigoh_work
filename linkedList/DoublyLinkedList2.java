package linkedList;



public class DoublyLinkedList2 {
    class Node {
        int data;
        Node prev;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public DoublyLinkedList2() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addToEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteFromFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void traverseForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void traverseBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " <-- ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList2 dll = new DoublyLinkedList2();

        dll.addToFront(10);
        dll.addToFront(20);
        dll.addToFront(30);

        System.out.println("Traversing forward after adding to front:");
        dll.traverseForward();

        dll.addToEnd(40);
        dll.addToEnd(50);

        System.out.println("Traversing forward after adding to end:");
        dll.traverseForward();

        System.out.println("Traversing backward:");
        dll.traverseBackward();

        dll.deleteFromFront();
        System.out.println("After deleting from front:");
        dll.traverseForward();

        dll.deleteFromEnd();
        System.out.println("After deleting from end:");
        dll.traverseForward();
    }
}
