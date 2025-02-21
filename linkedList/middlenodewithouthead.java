package linkedList;

public class middlenodewithouthead {

    public void middleNode(Node node) {
        if (node != null && node.next != null) {
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }

    public void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        middlenodewithouthead list = new middlenodewithouthead();
        System.out.println("Original List:");
        list.printList(head);

        Node nodeToDelete = head.next.next;
        list.middleNode(nodeToDelete);

        System.out.println("After removing the middle node:");
        list.printList(head);
    }
}
