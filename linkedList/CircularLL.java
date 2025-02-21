package linkedList;

class CircularLinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("Cannot delete from an empty list.");
            return;
        }

        Node current = head, prev = null;

        if (head == tail && head.data == data) {
            head = null;
            tail = null;
            System.out.println("Node with data " + data + " deleted. The list is now empty.");
            return;
        }

        do {
            if (current.data == data) {
                if (current == head) {
                    tail.next = head.next;
                    head = head.next;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                System.out.println("Node with data " + data + " deleted.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Node with data " + data + " not found.");
    }
}

public class CircularLL {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display();

        cll.delete(20);
        cll.display();

        cll.delete(10);
        cll.display();

        cll.delete(40);
        cll.display();

        cll.delete(50);
    }
}