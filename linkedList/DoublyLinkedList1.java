package linkedList;

class DoublyLinkedList1 {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addAt(int index, int data) {
        if (index < 0) ;

        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null);
            current = current.next;
        }

        if (current == tail) {
            addLast(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index < 0);

        if (head == null);

        if (index == 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null);
            current = current.next;
        }

        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList1 dll = new DoublyLinkedList1();
        dll.addFirst(10);
        dll.addLast(20);
        dll.addLast(30);
        dll.printList();
        dll.addAt(1, 15);
        dll.printList(); // Output: 10 15 20 30

        dll.deleteAt(2);
        dll.printList(); // Output: 10 15 30

        dll.addAt(0, 5);
        dll.printList(); // Output: 5 10 15 30

        dll.deleteAt(0);
        dll.printList(); // Output: 10 15 30
    }
}
