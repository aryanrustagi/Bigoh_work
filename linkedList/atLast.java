package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class atLast {
    public static Node insertAtLast(Node head, int data) {
        Node n1 = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
        return head;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " --> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printList(head);
        int data = 7;
        head = insertAtLast(head, data);
        printList(head);
    }
}