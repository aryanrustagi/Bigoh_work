package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class delete {
    static Node deleteNode(Node head, int x) {
        if (head == null) {
            return null;
        }
        Node y = head;
        if (x == 1 && y.next == null) {
            return null;
        }
        if (x == 1 && y.next != null) {
            head = head.next;
            return head;
        }
        Node temp = null;
        for (int i = 1; i < x - 1; i++) {
            y = y.next;
        }
        temp = y.next.next;
        Node del = y.next;
        del.next = null;
        y.next = temp;
        return head;

    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
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

        System.out.print("Original list: ");
        printList(head);

        int k = 2;
        head = deleteNode(head, k);

        System.out.print("List after deletion: ");
        printList(head);
    }
}