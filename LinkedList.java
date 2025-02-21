import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LL list = new LL();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for the linked list (type -1 to stop):");
        while (true) {
            int data = scanner.nextInt();
            if (data == -1) {
                break;
            }
            list.append(data);
        }

        System.out.println("The constructed linked list is:");
        list.display();

        scanner.close();
    }
}
